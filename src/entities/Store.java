package entities;

public class Store {
    int id;
    String name;
    String branchName;

    public Store() {
    }

    public Store(int id, String name, String branchName) {
        this.id = id;
        this.name = name;
        this.branchName = branchName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
