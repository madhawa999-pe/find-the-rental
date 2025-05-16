 class Wedding extends Rental {
    public double service_charge;
    public double tot;

    public void Set_data(int co_num,String co_name,double rentp_day,int days,double service_charge){
        super.Set_data(co_num, co_name, rentp_day, days);
        this.service_charge = service_charge;
    }
    public void Cal_data(){
        super.Cal_data();
       tot = base_tot+ service_charge;
    }
    public void Display(){
        super.Display();
        System.out.println("Service charge is " +service_charge);
        System.out.println("Grand total is " +tot);
    }
}
