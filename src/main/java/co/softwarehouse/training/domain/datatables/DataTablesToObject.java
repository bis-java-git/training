package co.softwarehouse.training.domain.datatables;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ${Ankit}
 * Date: 8/11/14
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataTablesToObject<T> implements Serializable {

    private static final long serialVersionUID = -8220588043068200705L;

    private List<T> aaData;

    private int sEcho;

    private Integer iTotalRecords;

    private Integer iTotalDisplayRecords;

    public List<T> getAaData() {
        return aaData;
    }

    public void setAaData(List<T> aaData) {
        this.aaData = aaData;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getsEcho() {
        return sEcho;
    }

    public void setsEcho(int sEcho) {
        this.sEcho = sEcho;
    }

    public Integer getiTotalRecords() {
        return iTotalRecords;
    }

    public void setiTotalRecords(Integer iTotalRecords) {
        this.iTotalRecords = iTotalRecords;
    }

    public Integer getiTotalDisplayRecords() {
        return iTotalDisplayRecords;
    }

    public void setiTotalDisplayRecords(Integer iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }
}
