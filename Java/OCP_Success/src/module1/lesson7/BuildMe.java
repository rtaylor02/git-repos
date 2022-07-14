package module1.lesson7;

import java.time.LocalDate;

public class BuildMe {
    private String name;
    private LocalDate date;

    private BuildMe() {} // Private constructor

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "BuildMe {\n\t" +
                "name = " + name + "\n\t" +
                "date = " + date + "\n" +
                "}";
    }

    public static class Builder {
        private BuildMe template = new BuildMe(); // Accessing private member of enclosing class

        private Builder() {} // Private constructor

        public Builder name(String name) {
            template.name = name;
            return this;
        }

        public Builder date(LocalDate date) {
            template.date = date;
            return this;
        }

        public BuildMe build() {
            BuildMe rv = template;
            template = null;
            return rv;
        }
    }
}

class TryBuilder {
    public static void main(String[] args) {
        BuildMe bm = BuildMe.builder()
                .name("Rod Taylor")
                .date(LocalDate.now())
                .build();
        System.out.println(bm);
    }
}
