package ink.yowyob.geofence.Enum;

public enum DayOfWeek {
    MONDAY("Lundi"),
    TUESDAY("Mardi"),
    WEDNESDAY("Mercredi"),
    THURSDAY("Jeudi"),
    FRIDAY("Vendredi"),
    SATURDAY("Samedi"),
    SUNDAY("Dimanche");

    private final String displayName;

    DayOfWeek(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Convertit un java.time.DayOfWeek vers notre enum personnalisé
     */
    public static DayOfWeek from(java.time.DayOfWeek javaDay) {
        return switch (javaDay) {
            case MONDAY -> MONDAY;
            case TUESDAY -> TUESDAY;
            case WEDNESDAY -> WEDNESDAY;
            case THURSDAY -> THURSDAY;
            case FRIDAY -> FRIDAY;
            case SATURDAY -> SATURDAY;
            case SUNDAY -> SUNDAY;
        };
    }

    /**
     * Convertit vers un java.time.DayOfWeek
     */
    public java.time.DayOfWeek toJavaDayOfWeek() {
        return switch (this) {
            case MONDAY -> java.time.DayOfWeek.MONDAY;
            case TUESDAY -> java.time.DayOfWeek.TUESDAY;
            case WEDNESDAY -> java.time.DayOfWeek.WEDNESDAY;
            case THURSDAY -> java.time.DayOfWeek.THURSDAY;
            case FRIDAY -> java.time.DayOfWeek.FRIDAY;
            case SATURDAY -> java.time.DayOfWeek.SATURDAY;
            case SUNDAY -> java.time.DayOfWeek.SUNDAY;
        };
    }

    /**
     * Parse une représentation courante d'un jour et renvoie l'enum projet.
     * Accepté: "MON", "Mon", "MONDAY", "Monday", "Lundi", "1" (1=MONDAY)
     */
    public static DayOfWeek parse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Day value cannot be null");
        }
        String s = input.trim().toUpperCase(java.util.Locale.ROOT);
        return switch (s) {
            case "MON", "MONDAY", "LUN", "LUNDI", "1" -> MONDAY;
            case "TUE", "TUESDAY", "MAR", "MARDI", "2" -> TUESDAY;
            case "WED", "WEDNESDAY", "MER", "MERCREDI", "3" -> WEDNESDAY;
            case "THU", "THURSDAY", "JEU", "JEUDI", "4" -> THURSDAY;
            case "FRI", "FRIDAY", "VEN", "VENDREDI", "5" -> FRIDAY;
            case "SAT", "SATURDAY", "SAM", "SAMEDI", "6" -> SATURDAY;
            case "SUN", "SUNDAY", "DIM", "DIMANCHE", "7" -> SUNDAY;
            default -> {
                // last resort: try java.time.DayOfWeek names (already mostly covered) or fail with clear message
                try {
                    yield from(java.time.DayOfWeek.valueOf(s));
                } catch (Exception e) {
                    throw new IllegalArgumentException("Invalid day value: '" + input + "'. Accepted examples: MON, Mon, MONDAY, Monday, Lundi, 1..7");
                }
            }
        };
    }
}