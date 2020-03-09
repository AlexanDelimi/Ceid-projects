 

public class Room_Type_E extends Room{
        private boolean check_discount;//elegths ekptwshs

        Room_Type_E(){
          
        }
        Room_Type_E(int maximum_capacity,double price_per_person)
        {super(maximum_capacity,price_per_person);
        }
            boolean check_discount()
            {
                check_discount=true;
                for (int c=0; c<availability.length; c++){
                    if(availability[c]!=null){
                        check_discount =false;}
                    }
            return check_discount;
            }// if you are the first reservation of the month you get a discount 25%
            double pricing(){
                double price=0;
                for (int c=0; c<availability.length; c++){
                    if(availability[c]!=null){
                        price=price+ price_per_person*availability[c].getPeople();
                    }
                    if (check_discount()==true){
                        price=price-price*25/100;
                    }
                }return price;
                }
        }



