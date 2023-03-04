import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerContainer {
    private List<Map<String, String>> list = new ArrayList<>();

    public CustomerContainer() {
    }

    public CustomerContainer serialize(Object object) throws IllegalAccessException, SecurityException {



        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields
        ) {
            Map<String, String> stringMap = new HashMap<>();
            if (field.isAnnotationPresent(Save.class)) {
                field.setAccessible(true);
                if (field.getGenericType()!=Object.class) {
                    stringMap.put("fieldType", field.getGenericType().getTypeName());
                    stringMap.put("fieldName", field.getName());
                    stringMap.put("fieldValue", field.get(object).toString());
                    list.add(stringMap);
                }
                else {
                    serialize(field);
                }
            }
        }
        return this;
    }

    public Customer deserialize() throws NoSuchFieldException, IllegalAccessException {
        Customer customer = new Customer();

        for (var l : list
        ) {
            Field field = Customer.class.getDeclaredField(l.get("fieldName"));
            field.setAccessible(true);

            switch (l.get("fieldType")) {
                case "java.lang.Integer", "int" -> field.set(customer, Integer.valueOf(l.get("fieldValue")));
                case "Customer$Gender" -> field.set(customer, Customer.Gender.valueOf(l.get("fieldValue")));
                default -> field.set(customer, l.get("fieldValue"));

            }
        }
        return customer;

    }
}
