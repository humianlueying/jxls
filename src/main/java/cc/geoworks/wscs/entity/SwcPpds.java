package cc.geoworks.wscs.entity;
public class SwcPpds {
    private String pid;//唯一编码
    private String stcd;//测站编码
    private java.util.Date tm;//日期
    private Double drp;//日降水量
    private String nt;//备注
    private java.util.Date moditime;//时间戳
    public SwcPpds() {
        super();
    }
    public SwcPpds(String pid,String stcd,java.util.Date tm,Double drp,String nt,java.util.Date moditime) {
        super();
        this.pid = pid;
        this.stcd = stcd;
        this.tm = tm;
        this.drp = drp;
        this.nt = nt;
        this.moditime = moditime;
    }
    public String getPid() {
        return this.pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getStcd() {
        return this.stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    public java.util.Date getTm() {
        return this.tm;
    }

    public void setTm(java.util.Date tm) {
        this.tm = tm;
    }

    public Double getDrp() {
        return this.drp;
    }

    public void setDrp(Double drp) {
        this.drp = drp;
    }

    public String getNt() {
        return this.nt;
    }

    public void setNt(String nt) {
        this.nt = nt;
    }

    public java.util.Date getModitime() {
        return this.moditime;
    }

    public void setModitime(java.util.Date moditime) {
        this.moditime = moditime;
    }

}
