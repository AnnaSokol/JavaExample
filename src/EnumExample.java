public class EnumExample {
    //------------------------------Variant 1----------------------------
    enum CoffeSize {
        SMALL(100),
        MEDIUM(200),
        BIG(300){ public String getCoffeClass() { return "G"; }
        };

        String coffeClass = "A";
        int milliliters;

        CoffeSize(int milliliters){
            this.milliliters = milliliters;
        }

        public String getCoffeClass() {
            return coffeClass;
        }

        public int getMilliliters() {
            return milliliters;
        }

    }

    /*------------------------------Variant 2-----------------------------
    class CoffeSize {
       public static final CoffeSize SMAL = new CoffeSize();
       public static final CoffeSize MEDIUM = new CoffeSize();
       public static final CoffeSize BIG = new CoffeSize();
     */

    public static void main(String[] args) {
        CoffeSize cof = CoffeSize.BIG;
        System.out.println(cof);
        System.out.println(cof.getMilliliters());
        System.out.println(cof.getCoffeClass());
    }
}
