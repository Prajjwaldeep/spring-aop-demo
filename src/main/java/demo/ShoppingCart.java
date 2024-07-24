package demo;


import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String Status){

        // Cross-cutting concerns:
        // Logging
        // Authentication & Authorization
        // Sanitize the Data



        System.out.println("Checkout Method from ShoppingCart called");
    }


    public int quantity(){
        return 2;
    }
}
