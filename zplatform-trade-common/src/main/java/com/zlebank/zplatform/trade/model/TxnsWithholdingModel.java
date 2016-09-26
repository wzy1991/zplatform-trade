package com.zlebank.zplatform.trade.model;
// Generated 2015-11-30 16:47:30 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.zlebank.zplatform.commons.utils.DateUtil;
import com.zlebank.zplatform.commons.utils.StringUtil;
import com.zlebank.zplatform.trade.bean.TradeBean;
import com.zlebank.zplatform.trade.bean.enums.BankEnmu;
import com.zlebank.zplatform.trade.bean.enums.BiztypeEnum;
import com.zlebank.zplatform.trade.bean.enums.CMBCCardTypeEnum;
import com.zlebank.zplatform.trade.bean.enums.CertifTypeEnmu;
import com.zlebank.zplatform.trade.bean.enums.ChanPayCertifTypeEnmu;
import com.zlebank.zplatform.trade.bean.enums.ChannelEnmu;
import com.zlebank.zplatform.trade.utils.ConsUtil;
import com.zlebank.zplatform.trade.utils.OrderNumber;

/**
 * TTxnsWithholding generated by hbm2java
 */
@Entity
@Table(name = "T_TXNS_WITHHOLDING")
public class TxnsWithholdingModel implements java.io.Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 6447847854696620489L;
    private long tid;
    private String serialno;
    private String merid;
    private String mername;
    private String transdate;
    private String transtime;
    private String servicecode;
    private String cardtype;
    private String accno;
    private String accname;
    private String certtype;
    private String certno;
    private String phone;
    private String payerbankinscode;
    private String provno;
    private String exectype;
    private String execcode;
    private String execmsg;
    private String validatestatus;
    private String payserialno;
    private String resv;
    private String memberid;
    private String orderno;
    private String payerbankname;
    private String cvn2;
    private String expired;
    private String biztype;
    private String bizno;
    private String bizobjtype;
    private BigDecimal tranamt;
    private String currency;
    private String purpose;
    private String cityno;
    private String agtno;
    private String oritransdate;
    private String orireqserialno;
    private String settdate;
    private String txnseqno;
    private String oriexectype;
    private String oriexeccode;
    private String oriexecmsg;
    
    private Long chargefee;
    private String banktrandate;
    private String banktrantime;
    private String chnlcode;
    public TxnsWithholdingModel() {
    }

    public TxnsWithholdingModel(long tid) {
        this.tid = tid;
    }
    public TxnsWithholdingModel(long tid, String serialno, String merid,
            String mername, String transdate, String transtime,
            String servicecode, String cardtype, String accno, String accname,
            String certtype, String certno, String phone,
            String payerbankinscode, String provno, String exectype,
            String execcode, String execmsg, String validatestatus,
            String payserialno, String resv) {
        this.tid = tid;
        this.serialno = serialno;
        this.merid = merid;
        this.mername = mername;
        this.transdate = transdate;
        this.transtime = transtime;
        this.servicecode = servicecode;
        this.cardtype = cardtype;
        this.accno = accno;
        this.accname = accname;
        this.certtype = certtype;
        this.certno = certno;
        this.phone = phone;
        this.payerbankinscode = payerbankinscode;
        this.provno = provno;
        this.exectype = exectype;
        this.execcode = execcode;
        this.execmsg = execmsg;
        this.validatestatus = validatestatus;
        this.payserialno = payserialno;
        this.resv = resv;
    }
    public TxnsWithholdingModel(PojoRealnameAuth realnameAuth) {
        this.serialno = OrderNumber.getInstance().generateRealNameOrderNo();
        this.merid = ConsUtil.getInstance().cons.getCmbc_merid();
        this.mername = ConsUtil.getInstance().cons.getCmbc_mername();
        this.transdate = DateUtil.getCurrentDate();
        this.transtime = DateUtil.getCurrentTime();
        this.servicecode = ConsUtil.REALNAMEAUTH;
        this.cardtype = CMBCCardTypeEnum.fromCardType(realnameAuth.getCardType()).getCode();
        this.accno = realnameAuth.getCardNo();
        this.accname = realnameAuth.getCustomerNm();
        this.certtype = CertifTypeEnmu.fromValue(realnameAuth.getCertifTp()).getCmbcCode();
        this.certno = realnameAuth.getCertifId();
        this.phone = realnameAuth.getPhoneNo().toString();
        this.memberid = realnameAuth.getMerId()+"";
        this.orderno = realnameAuth.getOrderId();
        this.chnlcode = ChannelEnmu.CMBCWITHHOLDING.getChnlcode();
    }
    public TxnsWithholdingModel(PojoRealnameAuth realnameAuth,ChannelEnmu channelEnmu) {
    	if(channelEnmu==ChannelEnmu.CHANPAYCOLLECTMONEY){
    		this.serialno = OrderNumber.getInstance().generateRealNameOrderNo();
            this.merid = ConsUtil.getInstance().cons.getChanpay_cj_merchant_id();
            this.mername = ConsUtil.getInstance().cons.getChanpay_cj_merchant_name();
            this.transdate = DateUtil.getCurrentDate();
            this.transtime = DateUtil.getCurrentTime();
            this.servicecode = ConsUtil.REALNAMEAUTH_CHANPAY;
            this.cardtype = realnameAuth.getCardType();
            this.accno = realnameAuth.getCardNo();
            this.accname = realnameAuth.getCustomerNm();
            this.certtype = ChanPayCertifTypeEnmu.fromValue(realnameAuth.getCertifTp()).getChanpyaCode();
            this.certno = realnameAuth.getCertifId();
            this.phone = realnameAuth.getPhoneNo().toString();
            this.memberid = realnameAuth.getMerId()+"";
            this.orderno = realnameAuth.getOrderId();
            this.chnlcode = channelEnmu.getChnlcode();
    	}else if(channelEnmu==ChannelEnmu.CMBCWITHHOLDING||channelEnmu==ChannelEnmu.CMBCSELFWITHHOLDING){
    		this.serialno = OrderNumber.getInstance().generateRealNameOrderNo();
            this.merid = ConsUtil.getInstance().cons.getCmbc_merid();
            this.mername = ConsUtil.getInstance().cons.getCmbc_mername();
            this.transdate = DateUtil.getCurrentDate();
            this.transtime = DateUtil.getCurrentTime();
            this.servicecode = ConsUtil.REALNAMEAUTH;
            this.cardtype = CMBCCardTypeEnum.fromCardType(realnameAuth.getCardType()).getCode();
            this.accno = realnameAuth.getCardNo();
            this.accname = realnameAuth.getCustomerNm();
            this.certtype = CertifTypeEnmu.fromValue(realnameAuth.getCertifTp()).getCmbcCode();
            this.certno = realnameAuth.getCertifId();
            this.phone = realnameAuth.getPhoneNo().toString();
            this.memberid = realnameAuth.getMerId()+"";
            this.orderno = realnameAuth.getOrderId();
            this.chnlcode = channelEnmu.getChnlcode();
    	}
        
    }
    
    public TxnsWithholdingModel(String bankinscode,String bankname,String bankaccno,String bankaccname,String bankacctype,String certtype,String certno,String mobile) {
        this.serialno = OrderNumber.getInstance().generateRealNameOrderNo();
        this.merid = ConsUtil.getInstance().cons.getCmbc_merid();
        this.mername = ConsUtil.getInstance().cons.getCmbc_mername();
        this.transdate = DateUtil.getCurrentDate();
        this.transtime = DateUtil.getCurrentTime();
        this.servicecode = ConsUtil.WHITELIST;
        this.cardtype = bankacctype;
        this.accno = bankaccno;
        this.accname = bankaccname;
        this.certtype = certtype;
        this.certno = certno;
        this.phone = mobile;
        this.memberid = "";
        this.orderno = "";
        this.payerbankinscode=bankinscode;
        this.payerbankname = bankname;
        this.chnlcode = ChannelEnmu.CMBCWITHHOLDING.getChnlcode();
    }
    
    public TxnsWithholdingModel(String bankinscode,String bankname,String bankaccno,String bankaccname,String bankacctype,String certtype,String certno,String mobile,ChannelEnmu channelEnmu) {
    	if(channelEnmu==ChannelEnmu.CHANPAYCOLLECTMONEY){
    		this.serialno = OrderNumber.getInstance().generateRealNameOrderNo();
	        this.merid = ConsUtil.getInstance().cons.getChanpay_cj_merchant_id();
	        this.mername = ConsUtil.getInstance().cons.getChanpay_cj_merchant_name();
	        this.transdate = DateUtil.getCurrentDate();
	        this.transtime = DateUtil.getCurrentTime();
	        this.servicecode = ConsUtil.PROTOCOLSIGN_CHANPAY;
	        this.cardtype = bankacctype;
	        this.accno = bankaccno;
	        this.accname = bankaccname;
	        this.certtype = certtype;
	        this.certno = certno;
	        this.phone = mobile;
	        this.memberid = "";
	        this.orderno = "";
	        this.payerbankinscode=bankinscode;
	        this.payerbankname = bankname;
	        this.chnlcode = channelEnmu.getChnlcode();
    	}
       
    }
    
    
    
    public TxnsWithholdingModel(String oritransdate,String orireqserialno,String txnseqno,ChannelEnmu channel) {
        switch (channel) {
            case CMBCWITHHOLDING :
                this.serialno = OrderNumber.getInstance().generateWithholdingQueryOrderNo();
                this.merid = ConsUtil.getInstance().cons.getCmbc_merid();
                this.mername = ConsUtil.getInstance().cons.getCmbc_mername();
                this.transdate = DateUtil.getCurrentDate();
                this.transtime = DateUtil.getCurrentTime();
                this.servicecode = ConsUtil.WITHHOLDINGQUERY;
                this.orireqserialno = orireqserialno;
                this.oritransdate = oritransdate;
                this.txnseqno = txnseqno;
                this.chnlcode = channel.getChnlcode();
                break;
            case CMBCSELFWITHHOLDING:
                this.merid = ConsUtil.getInstance().cons.getCmbc_self_merid();
                this.mername = ConsUtil.getInstance().cons.getCmbc_mername();
                this.transdate = DateUtil.getCurrentDate();
                this.transtime = DateUtil.getCurrentTime();
                this.servicecode = ConsUtil.WITHHOLDINGSELFQUERY;
                this.orireqserialno = orireqserialno;
                this.oritransdate = oritransdate;
                this.txnseqno = txnseqno;
                this.chnlcode = channel.getChnlcode();
                break;
        }
        
    }
    
    public TxnsWithholdingModel(TradeBean trade,ChannelEnmu channel) {
        switch (channel) {
            case CMBCWITHHOLDING :
                this.merid = ConsUtil.getInstance().cons.getCmbc_merid();;
                this.mername = ConsUtil.getInstance().cons.getCmbc_mername();;
                this.transdate = DateUtil.getCurrentDate();
                this.transtime = DateUtil.getCurrentTime();;
                this.servicecode = ConsUtil.WITHHOLDING;
                this.cardtype = CMBCCardTypeEnum.fromCardType(trade.getCardType()).getCode();
                this.accno = trade.getCardNo();
                this.accname = trade.getAcctName();
                this.certtype = CertifTypeEnmu.fromValue("01").getCmbcCode();
                this.certno = trade.getCertId();
                this.phone = trade.getMobile();
                this.payerbankinscode = trade.getBankCode().length()==8?trade.getBankCode():trade.getBankCode()+"0000";
                this.provno = trade.getProvno();
                this.memberid = trade.getMerchId();
                this.orderno = trade.getOrderId();
                this.payerbankname = BankEnmu.fromValue(payerbankinscode).getBankName();
                this.cvn2 = StringUtil.isEmpty(trade.getCvv2())?"":trade.getCvv2();
                this.expired = (StringUtil.isEmpty(trade.getMonth())?"":trade.getMonth())+(StringUtil.isEmpty(trade.getYear())?"":trade.getYear());
                this.biztype = BiztypeEnum.OtherCharge.getCode();
                this.bizno = "";
                this.bizobjtype = "00";
                this.tranamt = new BigDecimal(Long.valueOf(trade.getAmount()));
                this.currency = "RMB";
                this.purpose = "代收业务";
                this.cityno = "";
                this.agtno = "";
                this.txnseqno = trade.getTxnseqno();
                this.chnlcode = ChannelEnmu.CMBCWITHHOLDING.getChnlcode();
                break;

            case  CMBCSELFWITHHOLDING:
                this.merid = ConsUtil.getInstance().cons.getCmbc_self_merid();
                this.mername = ConsUtil.getInstance().cons.getCmbc_mername();
                this.transdate = DateUtil.getCurrentDate();
                this.transtime = DateUtil.getCurrentTime();;
                this.servicecode = ConsUtil.WITHHOLDINGSELF;
                this.cardtype = CMBCCardTypeEnum.fromCardType(trade.getCardType()).getCode();
                this.accno = trade.getCardNo();
                this.accname = trade.getAcctName();
                this.certtype = CertifTypeEnmu.fromValue("01").getCmbcCode();
                this.certno = trade.getCertId();
                this.phone = trade.getMobile();
                this.payerbankinscode = trade.getBankCode().trim().length()==8?trade.getBankCode().trim():trade.getBankCode()+"0000";
                this.provno = "";
                this.memberid = trade.getMerchId();
                this.orderno = trade.getOrderId();
                this.payerbankname = BankEnmu.fromValue(payerbankinscode).getBankName();
                this.cvn2 = StringUtil.isEmpty(trade.getCvv2())?"":trade.getCvv2();
                this.expired = (StringUtil.isEmpty(trade.getMonth())?"":trade.getMonth())+(StringUtil.isEmpty(trade.getYear())?"":trade.getYear());
                this.biztype = "";
                this.bizno = "";
                this.tranamt = new BigDecimal(Long.valueOf(trade.getAmount()));
                this.currency = "RMB";
                this.purpose = "代收业务";
                this.cityno = "";
                this.agtno = "";
                this.txnseqno = trade.getTxnseqno();
                this.chnlcode = ChannelEnmu.CMBCSELFWITHHOLDING.getChnlcode();
                break;
                
            case CHANPAYCOLLECTMONEY:
            	this.merid = ConsUtil.getInstance().cons.getChanpay_cj_merchant_id();
                this.mername = ConsUtil.getInstance().cons.getChanpay_cj_merchant_name();
                this.transdate = DateUtil.getCurrentDate();
                this.transtime = DateUtil.getCurrentTime();;
                this.servicecode = ConsUtil.WITHHOLDING_CHANPAY;
                this.cardtype = trade.getCardType();
                this.accno = trade.getCardNo();
                this.accname = trade.getAcctName();
                this.certtype = ChanPayCertifTypeEnmu.fromValue("01").getChanpyaCode();
                this.certno = trade.getCertId();
                this.phone = trade.getMobile();
                this.payerbankinscode = trade.getBankCode();
                this.provno = trade.getProvno();
                this.memberid = trade.getMerchId();
                this.orderno = trade.getOrderId();
                this.payerbankname = trade.getBankName();
               // this.cvn2 = StringUtil.isEmpty(trade.getCvv2())?"":trade.getCvv2();
               // this.expired = (StringUtil.isEmpty(trade.getMonth())?"":trade.getMonth())+(StringUtil.isEmpty(trade.getYear())?"":trade.getYear());
                this.biztype = ConsUtil.getInstance().cons.getChanpay_cj_business_code();
                this.bizno = ConsUtil.getInstance().cons.getChanpay_cj_product_no();
               // this.bizobjtype = "00";
                this.tranamt = new BigDecimal(Long.valueOf(trade.getAmount()));
                this.currency = "RMB";
                this.purpose = "代收业务";
                this.cityno = "";
                this.agtno = trade.getBindCardId();
                this.txnseqno = trade.getTxnseqno();
                this.chnlcode = ChannelEnmu.CHANPAYCOLLECTMONEY.getChnlcode();
            	break;
        }
        
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_withholding_id") 
    @SequenceGenerator(name="seq_withholding_id",sequenceName="SEQ_T_TXNS_WITHHOLDING_ID",allocationSize=1)
    @Column(name = "TID", unique = true, nullable = false, precision = 12, scale = 0)
    public long getTid() {
        return this.tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    @Column(name = "SERIALNO", length = 16)
    public String getSerialno() {
        return this.serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    @Column(name = "MERID", length = 15)
    public String getMerid() {
        return this.merid;
    }

    public void setMerid(String merid) {
        this.merid = merid;
    }

    @Column(name = "MERNAME", length = 128)
    public String getMername() {
        return this.mername;
    }

    public void setMername(String mername) {
        this.mername = mername;
    }

    @Column(name = "TRANSDATE", length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "TRANSTIME", length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "SERVICECODE", length = 15)
    public String getServicecode() {
        return this.servicecode;
    }

    public void setServicecode(String servicecode) {
        this.servicecode = servicecode;
    }

    @Column(name = "CARDTYPE", length = 1)
    public String getCardtype() {
        return this.cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    @Column(name = "ACCNO", length = 32)
    public String getAccno() {
        return this.accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    @Column(name = "ACCNAME", length = 128)
    public String getAccname() {
        return this.accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    @Column(name = "CERTTYPE", length = 4)
    public String getCerttype() {
        return this.certtype;
    }

    public void setCerttype(String certtype) {
        this.certtype = certtype;
    }

    @Column(name = "CERTNO", length = 20)
    public String getCertno() {
        return this.certno;
    }

    public void setCertno(String certno) {
        this.certno = certno;
    }

    @Column(name = "PHONE", length = 11)
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "PAYERBANKINSCODE", length = 8)
    public String getPayerbankinscode() {
        return this.payerbankinscode;
    }

    public void setPayerbankinscode(String payerbankinscode) {
        this.payerbankinscode = payerbankinscode;
    }

    @Column(name = "PROVNO", length = 6)
    public String getProvno() {
        return this.provno;
    }

    public void setProvno(String provno) {
        this.provno = provno;
    }

    @Column(name = "EXECTYPE", length = 1)
    public String getExectype() {
        return this.exectype;
    }

    public void setExectype(String exectype) {
        this.exectype = exectype;
    }

    @Column(name = "EXECCODE", length = 6)
    public String getExeccode() {
        return this.execcode;
    }

    public void setExeccode(String execcode) {
        this.execcode = execcode;
    }

    @Column(name = "EXECMSG", length = 256)
    public String getExecmsg() {
        return this.execmsg;
    }

    public void setExecmsg(String execmsg) {
        this.execmsg = execmsg;
    }

    @Column(name = "VALIDATESTATUS", length = 2)
    public String getValidatestatus() {
        return this.validatestatus;
    }

    public void setValidatestatus(String validatestatus) {
        this.validatestatus = validatestatus;
    }

    @Column(name = "PAYSERIALNO", length = 16)
    public String getPayserialno() {
        return this.payserialno;
    }

    public void setPayserialno(String payserialno) {
        this.payserialno = payserialno;
    }

    @Column(name = "RESV", length = 512)
    public String getResv() {
        return this.resv;
    }

    public void setResv(String resv) {
        this.resv = resv;
    }

    @Column(name = "MEMBERID", length = 15)
    public String getMemberid() {
        return this.memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    @Column(name = "ORDERNO", length = 32)
    public String getOrderno() {
        return this.orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    @Column(name = "PAYERBANKNAME", length = 128)
    public String getPayerbankname() {
        return this.payerbankname;
    }

    public void setPayerbankname(String payerbankname) {
        this.payerbankname = payerbankname;
    }

    @Column(name = "CVN2", length = 3)
    public String getCvn2() {
        return this.cvn2;
    }

    public void setCvn2(String cvn2) {
        this.cvn2 = cvn2;
    }

    @Column(name = "EXPIRED", length = 4)
    public String getExpired() {
        return this.expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    @Column(name = "BIZTYPE", length = 64)
    public String getBiztype() {
        return this.biztype;
    }

    public void setBiztype(String biztype) {
        this.biztype = biztype;
    }

    @Column(name = "BIZNO", length = 64)
    public String getBizno() {
        return this.bizno;
    }

    public void setBizno(String bizno) {
        this.bizno = bizno;
    }

    @Column(name = "BIZOBJTYPE", length = 2)
    public String getBizobjtype() {
        return this.bizobjtype;
    }

    public void setBizobjtype(String bizobjtype) {
        this.bizobjtype = bizobjtype;
    }

    @Column(name = "TRANAMT", precision = 12)
    public BigDecimal getTranamt() {
        return this.tranamt;
    }

    public void setTranamt(BigDecimal tranamt) {
        this.tranamt = tranamt;
    }

    @Column(name = "CURRENCY", length = 3)
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Column(name = "PURPOSE", length = 256)
    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Column(name = "CITYNO", length = 6)
    public String getCityno() {
        return this.cityno;
    }

    public void setCityno(String cityno) {
        this.cityno = cityno;
    }

    @Column(name = "AGTNO", length = 32)
    public String getAgtno() {
        return this.agtno;
    }

    public void setAgtno(String agtno) {
        this.agtno = agtno;
    }
    @Column(name = "ORITRANSDATE", length = 8)
    public String getOritransdate() {
        return oritransdate;
    }

    public void setOritransdate(String oritransdate) {
        this.oritransdate = oritransdate;
    }
    @Column(name = "ORIREQSERIALNO", length = 16)
    public String getOrireqserialno() {
        return orireqserialno;
    }

    public void setOrireqserialno(String orireqserialno) {
        this.orireqserialno = orireqserialno;
    }
    @Column(name = "SETTDATE", length = 8)
    public String getSettdate() {
        return settdate;
    }

    public void setSettdate(String settdate) {
        this.settdate = settdate;
    }
    @Column(name = "TXNSEQNO")
    public String getTxnseqno() {
        return txnseqno;
    }

    public void setTxnseqno(String txnseqno) {
        this.txnseqno = txnseqno;
    }
    @Column(name = "ORIEXECTYPE")
    public String getOriexectype() {
        return oriexectype;
    }

    public void setOriexectype(String oriexectype) {
        this.oriexectype = oriexectype;
    }
    @Column(name = "ORIEXECCODE")
    public String getOriexeccode() {
        return oriexeccode;
    }

    public void setOriexeccode(String oriexeccode) {
        this.oriexeccode = oriexeccode;
    }
    @Column(name = "ORIEXECMSG")
    public String getOriexecmsg() {
        return oriexecmsg;
    }

    public void setOriexecmsg(String oriexecmsg) {
        this.oriexecmsg = oriexecmsg;
    }
    @Column(name = "CHARGEFEE")
    public Long getChargefee() {
        return chargefee;
    }

    public void setChargefee(Long chargefee) {
        this.chargefee = chargefee;
    }
    @Column(name = "BANKTRANDATE")
    public String getBanktrandate() {
        return banktrandate;
    }

    public void setBanktrandate(String banktrandate) {
        this.banktrandate = banktrandate;
    }
    @Column(name = "BANKTRANTIME")
    public String getBanktrantime() {
        return banktrantime;
    }

    public void setBanktrantime(String banktrantime) {
        this.banktrantime = banktrantime;
    }
    @Column(name = "CHNLCODE")
    public String getChnlcode() {
        return chnlcode;
    }

    public void setChnlcode(String chnlcode) {
        this.chnlcode = chnlcode;
    }
    
    
}
