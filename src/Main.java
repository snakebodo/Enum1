public class Main {
    public static void main(String[] args) {


        /*Coffee americano = Coffee.AMERICANO;
        System.out.println(americano.getMilk());
        System.out.println(americano.getWater());*/

        /*Weekday weekday = Weekday.FRIDAY;
        System.out.println(weekday.isHoliday());
        System.out.println(weekday.isWeekDay());
        weekday.whichIsGreater(weekday.MONDAY);*/

        PackageSize packageSize = PackageSize.LARGE;
        System.out.println(packageSize);
        System.out.println(PackageSize.getPackageSize(25,25));
    }
}
//printarea se poate face la orice enum atat timp cat este definit
//Exemplu: Coffee americano = Coffee.AMERICANO;