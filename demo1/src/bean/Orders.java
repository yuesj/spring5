package bean;

/**
 * @author yuesj
 * @date 2020/6/5
 */
public class Orders {
    //属性
    private String oname;
    private String address;
    //有参数构造
    public Orders(String oname,String address) {
        this.oname = oname;
        this.address = address;
    }

    public void testOrders(){
        System.out.println(oname+":"+address);
    }
}
