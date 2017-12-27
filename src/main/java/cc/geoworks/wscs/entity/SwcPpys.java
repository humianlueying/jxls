package cc.geoworks.wscs.entity;
public class SwcPpys {
    private String pid;//唯一编码
    private String stcd;//测站编码
    private String year;//年份
    private Double p;//降水量
    private Double pd;//降水日数
    private Double mxpd;//最大日降水量
    private java.util.Date mxd;//最大日
    private Double mxmd;//最大月降水量
    private java.util.Date mxm;//最大月
    private Double mxsp;//最大次雨量
    private Double mxpdr;//最大次雨量历时
    private Double mxi30;//最大I30
    private java.util.Date mxi30d;//最大I30发生日期
    private Double mxre;//最大降雨侵蚀力
    private java.util.Date mxred;//最大降雨侵蚀力日期
    private java.util.Date fsd;//初雪日期
    private java.util.Date esd;//终雪日期
    private java.util.Date moditime;//时间戳
    private String nt;//备注
    public SwcPpys() {
        super();
    }
    public SwcPpys(String pid,String stcd,String year,Double p,Double pd,Double mxpd,java.util.Date mxd,Double mxmd,java.util.Date mxm,Double mxsp,Double mxpdr,Double mxi30,java.util.Date mxi30d,Double mxre,java.util.Date mxred,java.util.Date fsd,java.util.Date esd,java.util.Date moditime,String nt) {
        super();
        this.pid = pid;
        this.stcd = stcd;
        this.year = year;
        this.p = p;
        this.pd = pd;
        this.mxpd = mxpd;
        this.mxd = mxd;
        this.mxmd = mxmd;
        this.mxm = mxm;
        this.mxsp = mxsp;
        this.mxpdr = mxpdr;
        this.mxi30 = mxi30;
        this.mxi30d = mxi30d;
        this.mxre = mxre;
        this.mxred = mxred;
        this.fsd = fsd;
        this.esd = esd;
        this.moditime = moditime;
        this.nt = nt;
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

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getp() {
        return this.p;
    }

    public void setp(Double p) {
        this.p = p;
    }

    public Double getPd() {
        return this.pd;
    }

    public void setPd(Double pd) {
        this.pd = pd;
    }

    public Double getMxpd() {
        return this.mxpd;
    }

    public void setMxpd(Double mxpd) {
        this.mxpd = mxpd;
    }

    public java.util.Date getMxd() {
        return this.mxd;
    }

    public void setMxd(java.util.Date mxd) {
        this.mxd = mxd;
    }

    public Double getMxmd() {
        return this.mxmd;
    }

    public void setMxmd(Double mxmd) {
        this.mxmd = mxmd;
    }

    public java.util.Date getMxm() {
        return this.mxm;
    }

    public void setMxm(java.util.Date mxm) {
        this.mxm = mxm;
    }

    public Double getMxsp() {
        return this.mxsp;
    }

    public void setMxsp(Double mxsp) {
        this.mxsp = mxsp;
    }

    public Double getMxpdr() {
        return this.mxpdr;
    }

    public void setMxpdr(Double mxpdr) {
        this.mxpdr = mxpdr;
    }

    public Double getMxi30() {
        return this.mxi30;
    }

    public void setMxi30(Double mxi30) {
        this.mxi30 = mxi30;
    }

    public java.util.Date getMxi30d() {
        return this.mxi30d;
    }

    public void setMxi30d(java.util.Date mxi30d) {
        this.mxi30d = mxi30d;
    }

    public Double getMxre() {
        return this.mxre;
    }

    public void setMxre(Double mxre) {
        this.mxre = mxre;
    }

    public java.util.Date getMxred() {
        return this.mxred;
    }

    public void setMxred(java.util.Date mxred) {
        this.mxred = mxred;
    }

    public java.util.Date getFsd() {
        return this.fsd;
    }

    public void setFsd(java.util.Date fsd) {
        this.fsd = fsd;
    }

    public java.util.Date getEsd() {
        return this.esd;
    }

    public void setEsd(java.util.Date esd) {
        this.esd = esd;
    }

    public java.util.Date getModitime() {
        return this.moditime;
    }

    public void setModitime(java.util.Date moditime) {
        this.moditime = moditime;
    }

    public String getNt() {
        return this.nt;
    }

    public void setNt(String nt) {
        this.nt = nt;
    }

}
