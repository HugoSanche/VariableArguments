public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        int sum = main.sumNumbers(4, 5, 6, 7, 8, 58);
        System.out.println(sum);

        sum = main.sumNumbers(10, 10, 10);
        System.out.println(sum);

        System.out.println("****************************");

        sum = main.sumByDepartment("Sistemas", "Mexico", 10, 20, 30, 40, 50);
        System.out.println(sum);

        System.out.println("****************************");
        sum = main.sumByDepartment("Countability", "EU", 1, 2, 3, 4);
        System.out.println(sum);

    }

    public int sumNumbers(int... numbers) {
        int sum = 0;
        for (int numero : numbers) {
            sum += numero;
        }
        return sum;
    }


    //many arguments

    //Compile Error, variable arguments go to the final
//    public int sumByDepartment2(int... numbers,String department, String city,  ){
//        return 0;
//    }

    public int sumByDepartment(String department, String city, int... numbers) {
        System.out.println(department);
        System.out.println(city);
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}