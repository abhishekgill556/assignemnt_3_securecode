
public class simplelogin {
    public static void main(String[] args) {
        System.out.println("🟢 Starting Login System");

        // ❌ Hardcoded password (AppScan will catch this)
        String password = "admin123";

        // Simulated user input
        String enteredPassword = "admin123";

        // ❌ Insecure password comparison (no encryption)
        if (enteredPassword.equals(password)) {
            System.out.println("✅ Access granted");
        } else {
            System.out.println("❌ Access denied");
        }

        // ❌ Sensitive data exposed in logs
        System.out.println("DEBUG: Entered password = " + enteredPassword);
    }
}
