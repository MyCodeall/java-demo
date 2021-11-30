package com.main.ppstudy.bean;


public class RoleBean {
    private Long id;
    private String name;

    public RoleBean(){

    }
    public RoleBean(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     * @Override：覆写父类的方法，父类（Object自带了三个方法：
     *  toString()：把instance输出为String；
     *  equals()：判断两个instance是否逻辑相等；
     *  hashCode()：计算一个instance的哈希值。
     * ）
     */
    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
