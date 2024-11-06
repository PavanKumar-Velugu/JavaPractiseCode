package logic.corejava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Reflections {

    public static class Book {
        public void displayInfo() {
            System.out.println("Displaying book information.");
        }
    }

    public static class Video {
        public void displayInfo() {
            System.out.println("Displaying video information.");
        }
    }

    public static class Podcast {
        public void play() {
            System.out.println("Playing podcast.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the class name (Book, Video, Podcast):");
        String className = scanner.nextLine();

        System.out.println("Enter the method name (e.g., displayInfo, play):");
        String methodName = scanner.nextLine();

        System.out.println("className: "+className+", methodName: "+methodName);

        try {
//            Class<?> clazz = Class.forName(className);  // Dynamically load the class
            Class<?> clazz = Class.forName("logic.preparation.java.Reflections$" + className);  // Dynamically load the class

            Object obj = clazz.getDeclaredConstructor().newInstance();  // Create an instance of the class
            Method method = clazz.getMethod(methodName);  // Get the method dynamically
            method.invoke(obj);  // Call the method on the instance
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate class: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Illegal access: " + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + e.getMessage());
        } catch (InvocationTargetException e) {
            System.out.println("Method threw an exception: " + e.getCause());
        } finally {
            scanner.close();
        }
    }
}
