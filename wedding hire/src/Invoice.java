 class Invoice {
    public static void main(String[]args){
        Wedding w1 = new Wedding();
        w1.Set_data(101, "Nimal", 6000.0, 2, 2500.0);
        w1.Cal_data();
        w1.Display();

        Rental r1 = new Rental();

        r1.Set_data(101, "Nimal", 6000.0, 2);
        r1.Cal_data();
        r1.Display();




    }
}
