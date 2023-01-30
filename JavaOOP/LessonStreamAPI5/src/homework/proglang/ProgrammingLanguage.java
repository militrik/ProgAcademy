package homework.proglang;

enum DifficultyLevel {
    EASY, MEDIUM, HARD;
}

class ProgrammingLanguage implements Comparable<Object> {
    private String name;
    private DifficultyLevel complexity;

    public ProgrammingLanguage(String name, DifficultyLevel complexity) {
        super();
        this.name = name;
        this.complexity = complexity;
    }

    public String getName() {
        return name;
    }

    public DifficultyLevel getComplexity() {
        return complexity;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage [name=" + name + ", complexity=" + complexity + "]";
    }

    @Override
    public int compareTo(Object o) {
        ProgrammingLanguage b = (ProgrammingLanguage) o;
        ProgrammingLanguage a = this;
        if (a.getComplexity().ordinal() > b.getComplexity().ordinal()) {
            return 1;
        }
        if (a.getComplexity().ordinal() < b.getComplexity().ordinal()) {
            return -1;
        }
        return Integer.compare(a.getName().length(), b.getName().length());
    }
}
