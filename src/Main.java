public class Main {
    public static void main(String[] args) {
        // set up Task objects
        Task maximumPriority = new Task("Default");
        Task middlePriority = new Task("Default");
        Task minimumPriority = new Task("Default");
        Task task1 = new Task("Homework");
        task1.setPriority(1);
        task1.setComplexity(1);
        Task task2 = new Task("Wash Dishes");
        task2.setPriority(1);
        task2.setComplexity(1);
        Task task3 = new Task("Shopping");
        task3.setPriority(1);
        task3.setComplexity(2);

        // priority: 1-3
            // high, medium, low
        // complexity: 1-3
            // easy, medium, hard

        // task1 is "this" in the compareTo method
        // task2 is "inTask" in the compareTo method
        // task1.compareTo(task2);

        // check level of priority
        // low integer priority is more important
        // 0: equal importance
        // 1: more important
        // -1: less important
        if (task1.compareTo(task2) == 0) {
            // check level of complexity
            // high integer complexity is more important
            if (task1.compareTo(task3) == 0) {
                if (task1.getComplexity() > task2.getComplexity()) {
                    if (task1.getComplexity() > task3.getComplexity()) {
                        maximumPriority = task1;
                        if (task2.getComplexity() > task3.getComplexity()) {
                            middlePriority = task2;
                            minimumPriority = task3;
                        } else if (task2.getComplexity() < task3.getComplexity()) {
                            middlePriority = task3;
                            minimumPriority = task2;
                        } else {
                            middlePriority = task2;
                            minimumPriority = task3;
                        }
                    }
                } else if (task1.getComplexity() < task2.getComplexity()) {
                    if (task1.getComplexity() < task3.getComplexity()) {
                        minimumPriority = task1;
                        if (task2.getComplexity() < task3.getComplexity()) {
                            maximumPriority = task3;
                            middlePriority = task2;
                        } else if (task2.getComplexity() > task3.getComplexity()) {
                            maximumPriority = task2;
                            middlePriority = task3;
                        } else {
                            maximumPriority = task2;
                            middlePriority = task3;
                        }
                    }
                } else {
                    if (task1.getComplexity() < task3.getComplexity()) {
                        maximumPriority = task3;
                        middlePriority = task1;
                        minimumPriority = task2;
                    } else {
                        maximumPriority = task1;
                        middlePriority = task2;
                        minimumPriority = task3;
                    }
                }
            } else if (task1.compareTo(task3) == 1) {
                maximumPriority = task1;
                middlePriority = task2;
                minimumPriority = task3;
            } else {
                maximumPriority = task3;
                middlePriority = task1;
                minimumPriority = task2;
            }
        } else if (task1.compareTo(task2) == 1) {
            if (task1.compareTo(task3) == 1) {
                maximumPriority = task1;
                if (task2.compareTo(task3) == 1) {
                    middlePriority = task2;
                    minimumPriority = task3;
                } else {
                    middlePriority = task3;
                    minimumPriority = task2;
                }
            } else {
                maximumPriority = task3;
                middlePriority = task1;
                minimumPriority = task2;

            }
        } else if (task1.compareTo(task2) == -1) {
            if (task1.compareTo(task3) == 1) {
                maximumPriority = task2;
                middlePriority = task1;
                minimumPriority = task3;
            } else {
                minimumPriority = task1;
                if (task2.compareTo(task3) == 1) {
                    maximumPriority = task2;
                    middlePriority = task3;
                } else {
                    maximumPriority = task3;
                    middlePriority = task2;
                }
            }
        }

        // some resources
        // https://java-programming.mooc.fi/part-10/2-interface-comparable
        // https://www.javatpoint.com/Comparable-interface-in-collection-framework

        // output Task objects
        System.out.println(maximumPriority);
        System.out.println(middlePriority);
        System.out.println(minimumPriority);

    }
}