package third_type_conversions;

public class Demo {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = num1; //TYPE CONVERSION
        System.out.println("Original value: "+num1);
        System.out.println("Converted value: "+num2);

        double num3 = 3.14;
        int num4 = (int)num3; //YOU NEED TO DO MANUAL CONVERSION
        System.out.println("Original value: "+num3);
        System.out.println("Converted value: "+num4);

        //INCOMPATIBLE CONVERSIONS
        int zip = 500081;
        String str_zip = String.valueOf(zip); 
        System.out.println("original value: "+zip);
        System.out.println("converted value: "+str_zip);
        System.out.println(str_zip+5);

        String str_zip_new = "500081";
        int zip_new = Integer.parseInt(str_zip_new);
        System.out.println("Original value:"+str_zip_new);
        System.out.println("Converted value: "+zip_new);
        System.out.println(zip_new+5);

        //might not be possible
        //int num6 = 100;
        //boolean boolValue = num6;

    }

}
