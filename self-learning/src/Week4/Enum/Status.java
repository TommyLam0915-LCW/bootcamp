package Week4.Enum;

public enum Status {
    ORDERED(0), PAID(1), SHIPPED(2), COMPLETED(3);

    private int code;

    private Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static boolean isForwardStatus(Status oldStatus, Status newStatus) {
        return newStatus.getCode() > oldStatus.getCode();
    }

    public static Status get(int code) {
        for (Status s : values()) {
            if (s.code == code)
                return s;
        }
        return null; // or you can throw IAE
    }
}

