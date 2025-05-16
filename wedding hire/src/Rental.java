class Rental{
    public int co_num;
    public String co_name;
    public double rentp_day;
    public int days;
    public double base_tot;

    public void Set_data(int co_num,String co_name,double rentp_day,int days){
        this.co_num = co_num;
        this.co_name = co_name;
        this.rentp_day = rentp_day;
        this.days = days;
    }
    public void Cal_data(){
       base_tot = rentp_day * days;
    }
    public void Display(){
        System.out.println("Coustomer id is " +co_num);
        System.out.println("Coustomer name is " +co_name);
        System.out.println("rental per day "+rentp_day);
        System.out.println("rented days " +days);
        System.out.println("Total rent "+base_tot);

    }
}