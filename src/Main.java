public class Main {
    public static void main(String[] args) {
        // set up Task objects
        Task minimumPriority, minimumComplexity, middlePriority, middleComplexity, maximumPriority, maximumComplexity;
        Task task1 = new Task("Homework");
        task1.setComplexity(3);
        task1.setPriority(1);
        Task task2 = new Task("Wash Dishes");
        task2.setComplexity(1);
        task2.setPriority(2);
        Task task3 = new Task("Shopping");
        task2.setComplexity(2);
        task2.setPriority(3);

        // task1 is "this" in the compareTo method
        // task2 is "inTask" in the compareTo method
        // task1.compareTo(task2);

        // check level of priority
        // low integer priority is more important
        if (task1.compareTo(task2) == 0) {
            minimumPriority = inTask;
        } else if (task1.compareTo(task2) == 1) {
            middlePriority = inTask;
        } else if (task1.compareTo(task2) == -1) {
            maximumPriority = inTask;
        }

        // https://java-programming.mooc.fi/part-10/2-interface-comparable
        // https://www.javatpoint.com/Comparable-interface-in-collection-framework

        // check level of complexity
        // high integer complexity is more important
        if (inTask.getComplexity() >= 3) {
            maximumComplexity = inTask;
        } else if (inTask.getComplexity() >=2) {
            middleComplexity = inTask;
        } else if (inTask.getComplexity() >= 1) {
            minimumComplexity = inTask;
        }

        // output Task objects
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);

    }
}