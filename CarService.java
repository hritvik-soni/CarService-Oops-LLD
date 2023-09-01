import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("******* Welcome to Car Service Station *******");
        System.out.println("----- Services we offer -----");
        System.out.println("-> BS01-Basic Servicing");
        System.out.println("-> EF01-Engine Fixing");
        System.out.println("-> CF01-Clutch Fixing");
        System.out.println("-> BF01-Brake Fixing");
        System.out.println("-> GF01-Gear Fixing");
        System.out.println("----------------------------");

        Scanner s = new Scanner(System.in);
        System.out.println("please enter the type of car");
        String carType = s.nextLine();

        List<String> serviceCode = new ArrayList<>();
        System.out.println("please enter Service code");
        // while (s.hasNext()) {
        // serviceCode.add(s.next());
        // }
        String code = s.nextLine();
        code = code.toUpperCase();
        String[] str = code.split(",");
        serviceCode = Arrays.asList(str);

        carType = carType.toUpperCase();

        CarService carservice = new CarService();
        List<String> billList = carservice.carService(carType, serviceCode);

        for (String string : billList) {
            System.out.println(string);
        }
        s.close();

    }
}

class CarService {

    public List<String> carService(String carType, List<String> serviceCode) {

        List<String> billList = new ArrayList<>();

        int totalAmount = 0;

        if (carType.equals("HATCHBACK")) {

            billList.add("--------------------- BILL ----------------------");
            billList.add("Type of car - HATCHBACK");

            for (String code : serviceCode) {
                code = code.toUpperCase();

                if (code.equals("BS01")) {
                    totalAmount += 2000;
                    billList.add("BS01-Basic Servicing Cost- " + 2000);
                }

                else if (code.equals("EF01")) {
                    totalAmount += 5000;
                    billList.add("EF01-Engine Fixing- " + 5000);
                }

                else if (code.equals("CF01")) {
                    totalAmount += 2000;
                    billList.add("CF01-Clutch Fixing- " + 2000);
                }

                else if (code.equals("BF01")) {
                    totalAmount += 1000;
                    billList.add("BF01-Brake Fixing- " + 1000);
                }

                else if (code.equals("GF01")) {
                    totalAmount += 3000;
                    billList.add("GF01-Gear Fixing- " + 3000);
                }
            }
            billList.add("Total Bill Amount =  " + String.valueOf(totalAmount));
            if (totalAmount > 10000) {
                billList.add("A Complimentary Cleaning is Done for Free");
            }

            billList.add("--------------------- END ----------------------");
            return billList;

        } else if (carType.equals("SUV")) {

            billList.add("--------------------- BILL ----------------------");
            billList.add("Type of car - SUV");

            for (String code : serviceCode) {
                code = code.toUpperCase();

                if (code.equals("BS01")) {
                    totalAmount += 5000;
                    billList.add("BS01-Basic Servicing Cost- " + 5000);
                }

                else if (code.equals("EF01")) {
                    totalAmount += 10000;
                    billList.add("EF01-Engine Fixing- " + 10000);
                }

                else if (code.equals("CF01")) {
                    totalAmount += 6000;
                    billList.add("CF01-Clutch Fixing- " + 6000);
                }

                else if (code.equals("BF01")) {
                    totalAmount += 2500;
                    billList.add("BF01-Brake Fixing- " + 2500);
                }

                else if (code.equals("GF01")) {
                    totalAmount += 8000;
                    billList.add("GF01-Gear Fixing- " + 8000);
                }
            }
            billList.add("Total Bill Amount =  " + String.valueOf(totalAmount));
            if (totalAmount > 10000) {
                billList.add("A Complimentary Cleaning is Done for Free");
            }
            billList.add("--------------------- END ----------------------");
            return billList;

        } else if (carType.equals("SEDAN")) {

            billList.add("--------------------- BILL ----------------------");
            billList.add("Type of car - SEDAN");

            for (String code : serviceCode) {
                code = code.toUpperCase();

                if (code.equals("BS01")) {
                    totalAmount += 4000;
                    billList.add("BS01-Basic Servicing Cost- " + 4000);
                }

                else if (code.equals("EF01")) {
                    totalAmount += 8000;
                    billList.add("EF01-Engine Fixing- " + 8000);
                }

                else if (code.equals("CF01")) {
                    totalAmount += 4000;
                    billList.add("CF01-Clutch Fixing- " + 4000);
                }

                else if (code.equals("BF01")) {
                    totalAmount += 1500;
                    billList.add("BF01-Brake Fixing- " + 1500);
                }

                else if (code.equals("GF01")) {
                    totalAmount += 6000;
                    billList.add("GF01-Gear Fixing- " + 6000);
                }
            }
            billList.add("Total Bill Amount =  " + String.valueOf(totalAmount));
            if (totalAmount > 10000) {
                billList.add("A Complimentary Cleaning is Done for Free");
            }
            billList.add("--------------------- END ----------------------");
            return billList;
        }

        billList.add("***ERROR*** please enter correct cartype or service code");
        return billList;
    }
}
