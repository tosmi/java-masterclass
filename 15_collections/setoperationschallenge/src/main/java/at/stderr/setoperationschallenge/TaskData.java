package at.stderr.setoperationschallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskData {

    private static final String TASK_DATA = """
All Tasks
Infrastructure, Logging, High
Infrastructure, DB Access, Medium
Infrastructure, Security, High
Infrastructure, Password Policy, Medium
Data Design, Task Table, Medium
Data Design, Employee Table, Medium
Data Design, Cross Reference Tables, High
Data Design, Encryption Policy, High
Data Access, Write Views, Low
Data Access, Set Up Users, Low
Data Access, Set Up Access Policy, Low

Ann's Tasks
Infrastructure, Security, High, In Progress
Infrastructure, Password Policy,Medium, In Progress
Research, Cloud solutions, Medium, In Progress
Data Design, Encryption Policy, High
Data Design, Project Table, Medium
Data Access, Write Views,Low, In Progress
       
Bob's Tasks
Infrastructure, Security, High, In Progress
Infrastructure, Password Policy, Medium
Data Design,Encryption Policy,High
Data Access,Write Views, Low, In Progress

Carol's Tasks
Infrastructure, Logging, High, In Progress
Infrastructure, DB Access, Medium
Infrastructure, Password Policy, Medium
Data Design, Task Table, High
Data Access, Write Views, Low
            """;

    public Set<Task> getTasks(String assignee) {
        final Set<Task> tasks = new HashSet<>();
        String marker = switch(assignee.toLowerCase()) {
            case "all" -> "All Tasks";
            case "ann" -> "Ann's Tasks";
            case "bob" -> "Bob's Tasks";
            case "carol" -> "Carol's Tasks";
            default -> "";
        };

        Pattern p = Pattern.compile("^" + marker + "(.+?)(?:^$|\\Z)", Pattern.MULTILINE | Pattern.DOTALL);
        Matcher m = p.matcher(TASK_DATA);

        if (m.find())
            toSet(tasks, m.group(1), assignee.equalsIgnoreCase("all") ? null : assignee);

        return tasks;
    }

    private void toSet(Set<Task> tasks, String lines, String assignee) {
        for(String line : lines.strip().split("\n")) {
            String[] data = line.split(",");
            Arrays.asList(data).replaceAll(String::strip);

            Status status = (data.length <= 3) ? Status.IN_QUEUE :
                    Status.valueOf(data[3].toUpperCase().replace(' ', '_'));
            Priority priority = Priority.valueOf(data[2].toUpperCase());

            tasks.add(new Task(
                        data[0].strip(),
                        data[1].strip(),
                        assignee,
                        priority,
                        status
                        ));
        }
    }
}
