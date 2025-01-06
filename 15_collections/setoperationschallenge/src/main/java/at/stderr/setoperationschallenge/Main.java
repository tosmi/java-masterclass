package at.stderr.setoperationschallenge;

import java.util.*;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        TaskData taskData = new TaskData();

        Set<Task> tasks = taskData.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annsTasks = taskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annsTasks, sortByPriority);

    }

    private Set<Task> getUnion() {
        return null;
    }

    private Set<Task> getIntersect() {
        return null;
    }

    private Set<Task> getDifference() {
        return null;
    }

    private static void sortAndPrint(String header, Collection<Task> tasks) {
        sortAndPrint(header, tasks, null);
    }

    private static void sortAndPrint(String header, Collection<Task> collection, Comparator<Task> comparator) {
        String lineSeparator = "-".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(comparator);
        list.forEach(System.out::println);
    }
}
