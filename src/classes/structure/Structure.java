package classes.structure;

public abstract class Structure {
    
    protected int id;
    protected int level;
    protected String type;
    
    public Structure(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "\nStructure [id=" + id + ", level=" + level + ", type=" + type + "]";
    }

}
