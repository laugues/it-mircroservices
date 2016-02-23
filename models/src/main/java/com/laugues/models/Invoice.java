package com.laugues.models;


import com.laugues.models.adapter.DateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Invoice implements Serializable {

    /**
     * Default Constructor
     */
    public Invoice() {
        super();
    }


    public Invoice(String id, String status, Date date, Date dueDate, String number, BigDecimal totalAmount, BigDecimal totalNetAmount, String site, String type, String currency, String code, Date scanDate, String batchName, Date dateChangeState, String custom1, String custom2, String custom3, Date custom4, Date custom5, String supplierId, String supplierName, String customerId, String customerName, int companyId, String companyName, String countryCode, boolean showImage) {
        this.id = id;
        this.status = status;
        this.date = date;
        this.dueDate = dueDate;
        this.number = number;
        this.totalAmount = totalAmount;
        this.totalNetAmount = totalNetAmount;
        this.site = site;
        this.type = type;
        this.currency = currency;
        this.code = code;
        this.scanDate = scanDate;
        this.batchName = batchName;
        this.dateChangeState = dateChangeState;
        this.custom1 = custom1;
        this.custom2 = custom2;
        this.custom3 = custom3;
        this.custom4 = custom4;
        this.custom5 = custom5;
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.customerId = customerId;
        this.customerName = customerName;
        this.companyId = companyId;
        this.companyName = companyName;
        this.countryCode = countryCode;
        this.showImage = showImage;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", date=" + date +
                ", dueDate=" + dueDate +
                ", number='" + number + '\'' +
                ", totalAmount=" + totalAmount +
                ", totalNetAmount=" + totalNetAmount +
                ", site='" + site + '\'' +
                ", type='" + type + '\'' +
                ", currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", scanDate=" + scanDate +
                ", batchName='" + batchName + '\'' +
                ", dateChangeState=" + dateChangeState +
                ", custom1='" + custom1 + '\'' +
                ", custom2='" + custom2 + '\'' +
                ", custom3='" + custom3 + '\'' +
                ", custom4=" + custom4 +
                ", custom5=" + custom5 +
                ", supplierId='" + supplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", showImage=" + showImage +
                '}';
    }

    private static final long serialVersionUID = 1L;

    /**
     * The index.      *
     * id
     */
    private String id;

    /**
     * status
     */
    private String status;

    /**
     * The date.      *
     * date
     */
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date date;

    /**
     * The date.      *
     * dueDate
     */
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date dueDate;

    /**
     * The invoice number.
     *
     * number
     */
    private String number;

    /**
     * The TTC total amount.      *
     * totalAmount
     */
    private BigDecimal totalAmount;

    /**
     * The net total amount.      *
     * totalNetAmount
     */
    private BigDecimal totalNetAmount;

    /**
     * The site.      *
     * site
     */
    private String site;

    /**
     * The type.
     *
     * type
     */
    private String type;

    /**
     * The currency.      *
     * currency
     */
    private String currency;

    /**
     * The itesoft id.
     *
     * code
     */
    private String code;

    /**
     * The scan date.      *
     * scanDate
     */
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date scanDate;

    /**
     * The batchname.      *
     * batchName
     */
    private String batchName;

    /**
     * The date change state.      *
     * dateChangeState
     */
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date dateChangeState;

    /**
     * The custom1.      *
     * custom1
     */
    private String custom1;

    /**
     * The custom2.      *
     * custom2
     */
    private String custom2;

    /**
     * The custom3.
     *
     * custom3
     */
    private String custom3;

    /**
     * The custom4.      *
     * custom4
     */
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date custom4;

    /**
     * The custom5.      *
     * custom5
     */
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date custom5;

    private String supplierId;

    private String supplierName;

    private String customerId;

    private String customerName;

    private int companyId;

    private String companyName;

    private String countryCode;

    private boolean showImage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalNetAmount() {
        return totalNetAmount;
    }

    public void setTotalNetAmount(BigDecimal totalNetAmount) {
        this.totalNetAmount = totalNetAmount;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getScanDate() {
        return scanDate;
    }

    public void setScanDate(Date scanDate) {
        this.scanDate = scanDate;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Date getDateChangeState() {
        return dateChangeState;
    }

    public void setDateChangeState(Date dateChangeState) {
        this.dateChangeState = dateChangeState;
    }

    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1;
    }

    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2;
    }

    public String getCustom3() {
        return custom3;
    }

    public void setCustom3(String custom3) {
        this.custom3 = custom3;
    }

    public Date getCustom4() {
        return custom4;
    }

    public void setCustom4(Date custom4) {
        this.custom4 = custom4;
    }

    public Date getCustom5() {
        return custom5;
    }

    public void setCustom5(Date custom5) {
        this.custom5 = custom5;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public boolean isShowImage() {
        return showImage;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setShowImage(boolean showImage) {
        this.showImage = showImage;
    }
}
