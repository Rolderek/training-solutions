package week12d02;

public enum Fence {

    PERFECT("perfect"), NEED_UPGRADE("needUpgrade"), NO_FENCE("noFence");

    private String fenceState;

    Fence(String fenceState) {
        this.fenceState = fenceState;
    }

    public String getFenceState() {
        return fenceState;
    }
}
