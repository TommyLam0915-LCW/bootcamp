import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(upperName("Steven")); // Optional[STEVEN]
        System.out.println(upperName("Steven")); // STEVEN
        System.out.println(upperName(null)); // Optional.empty

        // 1. ifPresent()
        Optional<String> result = upperName(null);

        upperName(null).ifPresent(e -> {
            System.out.println("hello " + e.charAt(0)); // e must be non-null value
        });

        upperName("Steven").ifPresent(e -> {
            System.out.println("hello" + e.charAt(0)); // e must be non-null value
        });

        // 2. isPresent()
        Optional<String> name = Optional.of("Vincent");
        if (name.isPresent()) {
            System.out.println(result.get().charAt(0)); // No risk on NPE
        } else {
            System.out.println("Example2=" + result); // Optional.empty -> you cannot call get()
        }

        // 3. orElse
        String user = name.orElse("Jenny");
        System.out.println(user); // Vincent

        // 4. orElseGet
        String user2 = name.orElseGet(() -> "Jenny");
        System.out.println(user2);

        // 5. orElseThrow
        String user3 = name.orElseThrow(() -> new RuntimeException());
        System.out.println(user3); //Vincent 

    }

    public static Optional<String> upperName(String name) {
        // if (name == null){
        // throw new IllegalArgumentException();
        if (name != null)
            return Optional.of(name.toUpperCase());
        return Optional.empty(); // object, not a null value
    }
}
