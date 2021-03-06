/**
 * 
 */
package uvsoftgroup.springcassandrarestfulws.model;

import java.util.Date;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;
import org.springframework.data.cassandra.mapping.UserDefinedType;

import com.datastax.driver.mapping.annotations.UDT;

@UserDefinedType
@UDT(name="plotInfoBillingInfoUDT",keyspace="springcassandrarestfulws")
@Table
public class PlotInfoBillingInfo {
	@PrimaryKey(value="biId") 
	Long biId;
	Long biCreaterAddressId,biPlId;
	String biCreaterName,biCreaterAuthority;
	Date biCreateDate,biPayDateUntil,biLastModifiedDate,biPrintDate;
	String biCurrency,biCostType,biPrintCopy,biReferenceNumber,biRemark;
	Double biAmount;
	
	public PlotInfoBillingInfo(){
		super();
	}
	
	public Long getBiId() {
		return biId;
	}
	public void setBiId(Long biId) {
		this.biId = biId;
	}
	public Long getBiCreaterAddressId() {
		return biCreaterAddressId;
	}
	public void setBiCreaterAddressId(Long biCreaterAddressId) {
		this.biCreaterAddressId = biCreaterAddressId;
	}
	public String getBiCreaterName() {
		return biCreaterName;
	}
	public void setBiCreaterName(String biCreaterName) {
		this.biCreaterName = biCreaterName;
	}
	public String getBiCreaterAuthority() {
		return biCreaterAuthority;
	}
	public void setBiCreaterAuthority(String biCreaterAuthority) {
		this.biCreaterAuthority = biCreaterAuthority;
	}
	public Date getBiCreateDate() {
		return biCreateDate;
	}
	public void setBiCreateDate(Date biCreateDate) {
		this.biCreateDate = biCreateDate;
	}
	public Date getBiPayDateUntil() {
		return biPayDateUntil;
	}
	public void setBiPayDateUntil(Date biPayDateUntil) {
		this.biPayDateUntil = biPayDateUntil;
	}
	public Date getBiLastModifiedDate() {
		return biLastModifiedDate;
	}
	public void setBiLastModifiedDate(Date biLastModifiedDate) {
		this.biLastModifiedDate = biLastModifiedDate;
	}
	public Date getBiPrintDate() {
		return biPrintDate;
	}
	public void setBiPrintDate(Date biPrintDate) {
		this.biPrintDate = biPrintDate;
	}
	public String getBiCurrency() {
		return biCurrency;
	}
	public void setBiCurrency(String biCurrency) {
		this.biCurrency = biCurrency;
	}
	public String getBiCostType() {
		return biCostType;
	}
	public void setBiCostType(String biCostType) {
		this.biCostType = biCostType;
	}
	public String getBiPrintCopy() {
		return biPrintCopy;
	}
	public void setBiPrintCopy(String biPrintCopy) {
		this.biPrintCopy = biPrintCopy;
	}
	public Double getBiAmount() {
		return biAmount;
	}
	public void setBiAmount(Double biAmount) {
		this.biAmount = biAmount;
	}
	public String getBiReferenceNumber() {
		return biReferenceNumber;
	}
	public void setBiReferenceNumber(String biReferenceNumber) {
		this.biReferenceNumber = biReferenceNumber;
	}
	public String getBiRemark() {
		return biRemark;
	}
	public void setBiRemark(String biRemark) {
		this.biRemark = biRemark;
	}
	public Long getBiPlId() {
		return biPlId;
	}
	public void setBiPlId(Long biPlId) {
		this.biPlId = biPlId;
	}
	
	
	

}
