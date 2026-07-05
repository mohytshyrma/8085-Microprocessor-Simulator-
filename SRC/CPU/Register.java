package SRC.CPU;

/**
 * Represents a single 8-bit register of the 8085 microprocessor.
 * Stores the register value and provides basic operations.
 */
public class Register {

    // Stores the 8-bit value of the register (0 - 255)
    private int value;

    /**
     * Default constructor.
     * Initializes the register with value 0.
     */
    public Register() {
        value = 0;
    }

    public void clear(){
        value = 0;
        
    }

    /**
     * Returns the current value stored in the register.
     *
     * @return current register value
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the register value.
     * Only the lower 8 bits are stored.
     *
     * @param value Value to be stored
     */
    public void setValue(int value) {
        this.value = value & 0xFF;
    }

    /**
     * Decrements the register value by 1.
     * Wraps around using 8-bit arithmetic.
     */
    public void decreaseValue() {
        this.value = (this.value - 1) & 0xFF;
    }

    /**
     * Increments the register value by 1.
     * Wraps around using 8-bit arithmetic.
     */
    public void increaseValue() {
        this.value = (this.value + 1) & 0xFF;
    }
    
}S
