package com.zlebank.zplatform.trade.model;
// Generated 2015-11-4 13:14:53 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * TDownloadLog generated by hbm2java
 */
@Entity
@Table(name = "T_DOWNLOAD_LOG")
public class PojoDownloadLog implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5384521986238919632L;
	private long logid;
    private String filename;
    private Integer downloadcount;
    private String caid;
    private String downloadtime;
    private String caname;
    private long downloaderid;
    private String downloadername;
    private String recode;
    private String notes;
    private String remarks;
    private String fileurl;

    public PojoDownloadLog() {
    }

    public PojoDownloadLog(long logid, String filename, long downloaderid,
            String downloadername) {
        this.logid = logid;
        this.filename = filename;
        this.downloaderid = downloaderid;
        this.downloadername = downloadername;
    }
    public PojoDownloadLog(long logid, String filename, Integer downloadcount,
            String caid, String downloadtime, String caname, long downloaderid,
            String downloadername, String recode, String notes, String remarks,
            String fileurl) {
        this.logid = logid;
        this.filename = filename;
        this.downloadcount = downloadcount;
        this.caid = caid;
        this.downloadtime = downloadtime;
        this.caname = caname;
        this.downloaderid = downloaderid;
        this.downloadername = downloadername;
        this.recode = recode;
        this.notes = notes;
        this.remarks = remarks;
        this.fileurl = fileurl;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_download_id") 
    @SequenceGenerator(name="seq_download_id",sequenceName="SEQ_T_DOWNLOAD_LOG_LOGID",allocationSize=1)
    @Column(name = "LOGID", unique = true, nullable = false, precision = 10, scale = 0)
    public long getLogid() {
        return this.logid;
    }

    public void setLogid(long logid) {
        this.logid = logid;
    }

    @Column(name = "FILENAME", nullable = false, length = 64)
    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Column(name = "DOWNLOADCOUNT", precision = 2, scale = 0)
    public Integer getDownloadcount() {
        return this.downloadcount;
    }

    public void setDownloadcount(Integer downloadcount) {
        this.downloadcount = downloadcount;
    }

    @Column(name = "CAID",  length = 8)
    public String getCaid() {
        return this.caid;
    }

    public void setCaid(String caid) {
        this.caid = caid;
    }

    @Column(name = "DOWNLOADTIME", length = 32)
    public String getDownloadtime() {
        return this.downloadtime;
    }

    public void setDownloadtime(String downloadtime) {
        this.downloadtime = downloadtime;
    }

    @Column(name = "CANAME", length = 32)
    public String getCaname() {
        return this.caname;
    }

    public void setCaname(String caname) {
        this.caname = caname;
    }

    @Column(name = "DOWNLOADERID", nullable = false, precision = 10, scale = 0)
    public long getDownloaderid() {
        return this.downloaderid;
    }

    public void setDownloaderid(long downloaderid) {
        this.downloaderid = downloaderid;
    }

    @Column(name = "DOWNLOADERNAME", nullable = false, length = 64)
    public String getDownloadername() {
        return this.downloadername;
    }

    public void setDownloadername(String downloadername) {
        this.downloadername = downloadername;
    }

    @Column(name = "RECODE", length = 2)
    public String getRecode() {
        return this.recode;
    }

    public void setRecode(String recode) {
        this.recode = recode;
    }

    @Column(name = "NOTES", length = 128)
    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Column(name = "REMARKS", length = 128)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Column(name = "FILEURL", length = 128)
    public String getFileurl() {
        return this.fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

}
