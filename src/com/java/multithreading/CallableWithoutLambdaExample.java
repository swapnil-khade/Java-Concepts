package com.java.multithreading;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableWithoutLambdaExample {
	
    public static void main(String[] args) {
        // Create a thread pool with two threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create Callable tasks
      Task task1 = new Task("Task1");
        Callable<String> task2 = new Task("Task2");
        Callable<String> task3 = new Task("Task3");
        
        Callable<String> task4 = () ->{
        	 for (int i = 1; i <= 5; i++) {
                 System.out.println(Thread.currentThread().getName() + " - " + " Value: " + i);
                 Thread.sleep(500); // Pause for 500 milliseconds
             }
             return " Completed";
        };

        try {
            // Submit tasks to the executor
            Future<String> result1 = executor.submit(task1);
            Future<String> result2 = executor.submit(task2);
            Future<String> result3 = executor.submit(task3);
            Future<String> result4 = executor.submit(task4);

            // Retrieve and print results
            System.out.println(result1.get());
            System.out.println(result2.get());
            System.out.println(result3.get());
            System.out.println(result4.get());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            // Shut down the executor
            executor.shutdown();
        }
    }
}

class Task implements Callable<String> {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String call() throws Exception {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + taskName + " Value: " + i);
            Thread.sleep(500); // Pause for 500 milliseconds
        }
        return taskName + " Completed";
    }
}