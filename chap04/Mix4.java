public class Mix4 {

    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        // Declare and create a new Mix4 array variable of length 20
        Mix4[] m4a = new Mix4[20];
        int x = 0;
        while (x < 9) {
            /*
             * Create new Mix4 objects and assign them to the first 9
             * elements of the array
             */
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;

            count = count + 1;
            count = count + m4a[x].maybeNew(x);
            x = x + 1;
        }

        System.out.println(" count =" + count +
                "\n m4a1.counter=" + m4a[1].counter + "\n x=" + x);

    }

    public int maybeNew(int index) {

        if (index < 5) {
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }

        return 0;
    }
}
