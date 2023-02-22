import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

@SaveTo(path = "./file.txt")
class Container {
    String text ;

    public Container(String text) {
        this.text = text;
    }

    @Saver
    public void save() throws IOException, NoSuchFieldException, IllegalAccessException {
        File file = new File(this.getClass().getAnnotation(SaveTo.class).path());
        try (Writer writer = new FileWriter(file)) {
            writer.write((String) Container.class.getDeclaredField("text").get(this));
        }
    }

    public void foo (){
        System.out.println("This method should not be called");
    }
}
