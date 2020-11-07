public class Door {

    // Class attributes
    private boolean isClosed;  // If the door is closed this will be True, otherwise it is False
    private boolean isLocked;
    private String key;

    /**
     * Constructor method. This is used to create instances of this class Door.
     * @param key
     */
    public Door(String key){
        this.isClosed = true;
        this.isLocked = true;
        this.key = key;
    }

    public boolean getIsLocked(){
        return this.isLocked;
    }

    public boolean getIsClosed(){
        return this.isClosed;
    }

    /**
     * This is a private method because it is only used within the class and it is not
     * part of the public interface of the class.
     * @param key
     * @return
     */
    private boolean keyIsValid(String key){
        return this.key.compareTo(key) == 0;
    }

    /**
     *
     * @param key
     * @return
     */
    public boolean unlock(String key){
        boolean successfullyUnlockedTheDoor = false;
        if(this.isLocked && this.keyIsValid(key)){
            this.isLocked = false;
            successfullyUnlockedTheDoor = true;
        } // IF ENDS
        return successfullyUnlockedTheDoor;
    } // METHOD UNLOCK ENDS

    /**
     *
     * @return
     */
    public boolean open(){
        boolean successfullyOpenedDoor = false;
        if(!this.isLocked){
            this.isClosed = false; // Change the state of the door to open
            successfullyOpenedDoor = true;
        }
        return successfullyOpenedDoor;
    } // METHOD OPEN ENDS

}
