public class Main {
    public static final String[] validEmail = new String[] {"buithinh@gmail.com","123Thinh@hotmail.com","ThinhBui@yahoo.com"};
    public static final String[] inValidEmail = new String[] {"@gmail.com", "%phantram@hotmail.com","kimAnh.com"};

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email: validEmail) {
            boolean isValid = emailExample.validates(email);
            System.out.println("Email " + email + " is valid: " + isValid);
        }

        for (String email: inValidEmail) {
            boolean isValid = emailExample.validates(email);
            System.out.println("Email " + email+ " is valid: " + isValid);
        }
    }
}
