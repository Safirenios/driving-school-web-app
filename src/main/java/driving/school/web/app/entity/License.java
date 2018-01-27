package driving.school.web.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "driver_licenses")
public class License {

	@Id
	@JsonProperty("id")
	private String id;

	@Column(name = "am")
	@JsonProperty("am")
	private String am;

	@Column(name = "am_date")
	@JsonProperty("amDate")
	private String amDate;

	@Column(name = "am_finished")
	@JsonProperty("amFinished")
	private String amFinished;

	@Column(name = "a1")
	@JsonProperty("a1")
	private String a1;

	@Column(name = "a1_date")
	@JsonProperty("a1Date")
	private String a1Date;

	@Column(name = "a1_finished")
	@JsonProperty("a1Finished")
	private String a1Finished;

	@Column(name = "a1_finished_date")
	@JsonProperty("a1FinishedDate")
	private String a1FinishedDate;

	@Column(name = "a2")
	@JsonProperty("a2")
	private String a2;

	@Column(name = "a2_date")
	@JsonProperty("a2Date")
	private String a2Date;

	@Column(name = "a2_finished")
	@JsonProperty("a2Finished")
	private String a2Finished;

	@Column(name = "a2_finished_date")
	@JsonProperty("a2FinishedDate")
	private String a2FinishedDate;

	@Column(name = "a")
	@JsonProperty("a")
	private String a;

	@Column(name = "a_date")
	@JsonProperty("aDate")
	private String aDate;

	@Column(name = "a_finished")
	@JsonProperty("aFinished")
	private String aFinished;

	@Column(name = "a_finished_date")
	@JsonProperty("aFinishedDate")
	private String aFinishedDate;

	@Column(name = "b1")
	@JsonProperty("b1")
	private String b1;

	@Column(name = "b1_date")
	@JsonProperty("b1Date")
	private String b1Date;

	@Column(name = "b1_finished")
	@JsonProperty("b1Finished")
	private String b1Finished;

	@Column(name = "b1_finished_date")
	@JsonProperty("b1FinishedDate")
	private String b1FinishedDate;

	@Column(name = "b")
	@JsonProperty("b")
	private String b;

	@Column(name = "b_date")
	@JsonProperty("bDate")
	private String bDate;

	@Column(name = "b_finished")
	@JsonProperty("bFinished")
	private String bFinished;

	@Column(name = "b_finished_date")
	@JsonProperty("bFinishedDate")
	private String bFinishedDate;

	@Column(name = "c1")
	@JsonProperty("c1")
	private String c1;

	@Column(name = "c1_date")
	@JsonProperty("c1Date")
	private String c1Date;

	@Column(name = "c1_finished")
	@JsonProperty("c1Finished")
	private String c1Finished;

	@Column(name = "c1_finished_date")
	@JsonProperty("c1FinishedDate")
	private String c1FinishedDate;

	@Column(name = "c")
	@JsonProperty("c")
	private String c;

	@Column(name = "c_date")
	@JsonProperty("cDate")
	private String cDate;

	@Column(name = "c_finished")
	@JsonProperty("cFinished")
	private String cFinished;

	@Column(name = "c_finished_date")
	@JsonProperty("cFinishedDate")
	private String cFinishedDate;

	@Column(name = "d1")
	@JsonProperty("d1")
	private String d1;

	@Column(name = "d1_date")
	@JsonProperty("d1Date")
	private String d1Date;

	@Column(name = "d1_finished")
	@JsonProperty("d1Finished")
	private String d1Finished;

	@Column(name = "d1_finished_date")
	@JsonProperty("d1FinishedFate")
	private String d1FinishedFate;

	@Column(name = "d")
	@JsonProperty("d")
	private String d;

	@Column(name = "d_Date")
	@JsonProperty("dDate")
	private String dDate;

	@Column(name = "d_finished")
	@JsonProperty("dFinished")
	private String dFinished;

	@Column(name = "d_finished_date")
	@JsonProperty("dFinishedDate")
	private String dFinishedDate;

	@Column(name = "be")
	@JsonProperty("be")
	private String be;

	@Column(name = "be_date")
	@JsonProperty("beDate")
	private String beDate;

	@Column(name = "be_finished")
	@JsonProperty("beFinished")
	private String beFinished;

	@Column(name = "be_finished_date")
	@JsonProperty("beFinishedDate")
	private String beFinishedDate;

	@Column(name = "c1e")
	@JsonProperty("c1e")
	private String c1e;

	@Column(name = "c1e_date")
	@JsonProperty("c1eDate")
	private String c1eDate;

	@Column(name = "c1e_finished")
	@JsonProperty("c1eFinished")
	private String c1eFinished;

	@Column(name = "c1e_finished_date")
	@JsonProperty("c1eFinishedDate")
	private String c1eFinishedDate;

	@Column(name = "ce")
	@JsonProperty("ce")
	private String ce;

	@Column(name = "ce_date")
	@JsonProperty("ceDate")
	private String ceDate;

	@Column(name = "ce_finished")
	@JsonProperty("ceFinished")
	private String ceFinished;

	@Column(name = "ce_finished_date")
	@JsonProperty("ceFinishedDate")
	private String ceFinishedDate;

	@Column(name = "d1e")
	@JsonProperty("d1e")
	private String d1e;

	@Column(name = "d1e_date")
	@JsonProperty("d1eDate")
	private String d1eDate;

	@Column(name = "d1e_finished")
	@JsonProperty("d1eFinished")
	private String d1eFinished;

	@Column(name = "d1e_finished_date")
	@JsonProperty("d1eFinishedDate")
	private String d1eFinishedDate;

	@Column(name = "de")
	@JsonProperty("de")
	private String de;

	@Column(name = "de_date")
	@JsonProperty("deDate")
	private String deDate;

	@Column(name = "de_finished")
	@JsonProperty("deFinished")
	private String deFinished;

	@Column(name = "de_finished_date")
	@JsonProperty("deFinishedDate")
	private String deFinishedDate;

	public License() {

	}

	public String getId() {
		return id;
	}

	public String getAm() {
		return am;
	}

	public String getAmDate() {
		return amDate;
	}

	public String getAmFinished() {
		return amFinished;
	}

	public String getA1() {
		return a1;
	}

	public String getA1Date() {
		return a1Date;
	}

	public String getA1Finished() {
		return a1Finished;
	}

	public String getA1FinishedDate() {
		return a1FinishedDate;
	}

	public String getA2() {
		return a2;
	}

	public String getA2Date() {
		return a2Date;
	}

	public String getA2Finished() {
		return a2Finished;
	}

	public String getA2FinishedDate() {
		return a2FinishedDate;
	}

	public String getA() {
		return a;
	}

	public String getaDate() {
		return aDate;
	}

	public String getaFinished() {
		return aFinished;
	}

	public String getaFinishedDate() {
		return aFinishedDate;
	}

	public String getB1() {
		return b1;
	}

	public String getB1Date() {
		return b1Date;
	}

	public String getB1Finished() {
		return b1Finished;
	}

	public String getB1FinishedDate() {
		return b1FinishedDate;
	}

	public String getB() {
		return b;
	}

	public String getbDate() {
		return bDate;
	}

	public String getbFinished() {
		return bFinished;
	}

	public String getbFinishedDate() {
		return bFinishedDate;
	}

	public String getC1() {
		return c1;
	}

	public String getC1Date() {
		return c1Date;
	}

	public String getC1Finished() {
		return c1Finished;
	}

	public String getC1FinishedDate() {
		return c1FinishedDate;
	}

	public String getC() {
		return c;
	}

	public String getcDate() {
		return cDate;
	}

	public String getcFinished() {
		return cFinished;
	}

	public String getcFinishedDate() {
		return cFinishedDate;
	}

	public String getD1() {
		return d1;
	}

	public String getD1Date() {
		return d1Date;
	}

	public String getD1Finished() {
		return d1Finished;
	}

	public String getD1FinishedFate() {
		return d1FinishedFate;
	}

	public String getD() {
		return d;
	}

	public String getdDate() {
		return dDate;
	}

	public String getdFinished() {
		return dFinished;
	}

	public String getdFinishedDate() {
		return dFinishedDate;
	}

	public String getBe() {
		return be;
	}

	public String getBeDate() {
		return beDate;
	}

	public String getBeFinished() {
		return beFinished;
	}

	public String getBeFinishedDate() {
		return beFinishedDate;
	}

	public String getC1e() {
		return c1e;
	}

	public String getC1eDate() {
		return c1eDate;
	}

	public String getC1eFinished() {
		return c1eFinished;
	}

	public String getC1eFinishedDate() {
		return c1eFinishedDate;
	}

	public String getCe() {
		return ce;
	}

	public String getCeDate() {
		return ceDate;
	}

	public String getCeFinished() {
		return ceFinished;
	}

	public String getCeFinishedDate() {
		return ceFinishedDate;
	}

	public String getD1e() {
		return d1e;
	}

	public String getD1eDate() {
		return d1eDate;
	}

	public String getD1eFinished() {
		return d1eFinished;
	}

	public String getD1eFinishedDate() {
		return d1eFinishedDate;
	}

	public String getDe() {
		return de;
	}

	public String getDeDate() {
		return deDate;
	}

	public String getDeFinished() {
		return deFinished;
	}

	public String getDeFinishedDate() {
		return deFinishedDate;
	}

	private License(Builder builder) {
		this.id = builder.id;
		this.am = builder.am;
		this.amDate = builder.amDate;
		this.amFinished = builder.amFinished;
		this.a1 = builder.a1;
		this.a1Date = builder.a1Date;
		this.a1Finished = builder.a1Finished;
		this.a1FinishedDate = builder.a1FinishedDate;
		this.a2 = builder.a2;
		this.a2Date = builder.a2Date;
		this.a2Finished = builder.a2Finished;
		this.a2FinishedDate = builder.a2FinishedDate;
		this.a = builder.a;
		this.aDate = builder.aDate;
		this.aFinished = builder.aFinished;
		this.aFinishedDate = builder.aFinishedDate;
		this.b1 = builder.b1;
		this.b1Date = builder.b1Date;
		this.b1Finished = builder.b1Finished;
		this.b1FinishedDate = builder.b1FinishedDate;
		this.b = builder.b;
		this.bDate = builder.bDate;
		this.bFinished = builder.bFinished;
		this.bFinishedDate = builder.bFinishedDate;
		this.c1 = builder.c1;
		this.c1Date = builder.c1Date;
		this.c1Finished = builder.c1Finished;
		this.c1FinishedDate = builder.c1FinishedDate;
		this.c = builder.c;
		this.cDate = builder.cDate;
		this.cFinished = builder.cFinished;
		this.cFinishedDate = builder.cFinishedDate;
		this.d1 = builder.d1;
		this.d1Date = builder.d1Date;
		this.d1Finished = builder.d1Finished;
		this.d1FinishedFate = builder.d1FinishedFate;
		this.d = builder.d;
		this.dDate = builder.dDate;
		this.dFinished = builder.dFinished;
		this.dFinishedDate = builder.dFinishedDate;
		this.be = builder.be;
		this.beDate = builder.beDate;
		this.beFinished = builder.beFinished;
		this.beFinishedDate = builder.beFinishedDate;
		this.c1e = builder.c1e;
		this.c1eDate = builder.c1eDate;
		this.c1eFinished = builder.c1eFinished;
		this.c1eFinishedDate = builder.c1eFinishedDate;
		this.ce = builder.ce;
		this.ceDate = builder.ceDate;
		this.ceFinished = builder.ceFinished;
		this.ceFinishedDate = builder.ceFinishedDate;
		this.d1e = builder.d1e;
		this.d1eDate = builder.d1eDate;
		this.d1eFinished = builder.d1eFinished;
		this.d1eFinishedDate = builder.d1eFinishedDate;
		this.de = builder.de;
		this.deDate = builder.deDate;
		this.deFinished = builder.deFinished;
		this.deFinishedDate = builder.deFinishedDate;

	}

	@Override
	public String toString() {
		return "DriverLicenses [id=" + id + ", am=" + am + ", amDate=" + amDate + ", amFinished=" + amFinished + ", a1="
				+ a1 + ", a1Date=" + a1Date + ", a1Finished=" + a1Finished + ", a1FinishedDate=" + a1FinishedDate
				+ ", a2=" + a2 + ", a2Date=" + a2Date + ", a2Finished=" + a2Finished + ", a2FinishedDate="
				+ a2FinishedDate + ", a=" + a + ", aDate=" + aDate + ", aFinished=" + aFinished + ", aFinishedDate="
				+ aFinishedDate + ", b1=" + b1 + ", b1Date=" + b1Date + ", b1Finished=" + b1Finished
				+ ", b1FinishedDate=" + b1FinishedDate + ", b=" + b + ", bDate=" + bDate + ", bFinished=" + bFinished
				+ ", bFinishedDate=" + bFinishedDate + ", c1=" + c1 + ", c1Date=" + c1Date + ", c1Finished="
				+ c1Finished + ", c=" + c + ", cDate=" + cDate + ", cFinished=" + cFinished + ", cFinishedDate="
				+ cFinishedDate + ", d1=" + d1 + ", d1Date=" + d1Date + ", d1Finished=" + d1Finished
				+ ", d1FinishedFate=" + d1FinishedFate + ", d=" + d + ", dDate=" + dDate + ", dFinished=" + dFinished
				+ ", dFinishedDate=" + dFinishedDate + ", be=" + be + ", beDate=" + beDate + ", beFinished="
				+ beFinished + ", beFinishedDate=" + beFinishedDate + ", c1e=" + c1e + ", c1eDate=" + c1eDate
				+ ", c1eFinished=" + c1eFinished + ", c1eFinishedDate=" + c1eFinishedDate + ", ce=" + ce + ", ceDate="
				+ ceDate + ", ceFinished=" + ceFinished + ", ceFinishedDate=" + ceFinishedDate + ", d1e=" + d1e
				+ ", d1eDate=" + d1eDate + ", d1eFinished=" + d1eFinished + ", d1eFinishedDate=" + d1eFinishedDate
				+ ", de=" + de + ", deDate=" + deDate + ", deFinished=" + deFinished + ", deFinishedDate="
				+ deFinishedDate + "]";
	}

	public static class Builder {

		private String id;
		private String am;
		private String amDate;
		private String amFinished;
		private String a1;
		private String a1Date;
		private String a1Finished;
		private String a1FinishedDate;
		private String a2;
		private String a2Date;
		private String a2Finished;
		private String a2FinishedDate;
		private String a;
		private String aDate;
		private String aFinished;
		private String aFinishedDate;
		private String b1;
		private String b1Date;
		private String b1Finished;
		private String b1FinishedDate;
		private String b;
		private String bDate;
		private String bFinished;
		private String bFinishedDate;
		private String c1;
		private String c1Date;
		private String c1Finished;
		private String c1FinishedDate;
		private String c;
		private String cDate;
		private String cFinished;
		private String cFinishedDate;
		private String d1;
		private String d1Date;
		private String d1Finished;
		private String d1FinishedFate;
		private String d;
		private String dDate;
		private String dFinished;
		private String dFinishedDate;
		private String be;
		private String beDate;
		private String beFinished;
		private String beFinishedDate;
		private String c1e;
		private String c1eDate;
		private String c1eFinished;
		private String c1eFinishedDate;
		private String ce;
		private String ceDate;
		private String ceFinished;
		private String ceFinishedDate;
		private String d1e;
		private String d1eDate;
		private String d1eFinished;
		private String d1eFinishedDate;
		private String de;
		private String deDate;
		private String deFinished;
		private String deFinishedDate;

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder am(String am) {
			this.am = am;
			return this;
		}

		public Builder amDate(String amDate) {
			this.amDate = amDate;
			return this;
		}

		public Builder amFinished(String amFinished) {
			this.amFinished = amFinished;
			return this;
		}

		public Builder a1(String a1) {
			this.a1 = a1;
			return this;
		}

		public Builder a1Date(String a1Date) {
			this.a1Date = a1Date;
			return this;
		}

		public Builder a1Finished(String a1Finished) {
			this.a1Finished = a1Finished;
			return this;
		}

		public Builder a1FinishedDate(String a1FinishedDate) {
			this.a1FinishedDate = a1FinishedDate;
			return this;
		}

		public Builder a2(String a2) {
			this.a2 = a2;
			return this;
		}

		public Builder a2Date(String a2Date) {
			this.a2Date = a2Date;
			return this;
		}

		public Builder a2Finished(String a2Finished) {
			this.a2Finished = a2Finished;
			return this;
		}

		public Builder a2FinishedDate(String a2FinishedDate) {
			this.a2FinishedDate = a2FinishedDate;
			return this;
		}

		public Builder a(String a) {
			this.a = a;
			return this;
		}

		public Builder aDate(String aDate) {
			this.aDate = aDate;
			return this;
		}

		public Builder aFinished(String aFinished) {
			this.aFinished = aFinished;
			return this;
		}

		public Builder aFinishedDate(String aFinishedDate) {
			this.aFinishedDate = aFinishedDate;
			return this;
		}

		public Builder b1(String b1) {
			this.b1 = b1;
			return this;
		}

		public Builder b1Date(String b1Date) {
			this.b1Date = b1Date;
			return this;
		}

		public Builder b1Finished(String b1Finished) {
			this.b1Finished = b1Finished;
			return this;
		}

		public Builder b1FinishedDate(String b1FinishedDate) {
			this.b1FinishedDate = b1FinishedDate;
			return this;
		}

		public Builder b(String b) {
			this.b = b;
			return this;
		}

		public Builder bDate(String bDate) {
			this.bDate = bDate;
			return this;
		}

		public Builder bFinished(String bFinished) {
			this.bFinished = bFinished;
			return this;
		}

		public Builder bFinishedDate(String bFinishedDate) {
			this.bFinishedDate = bFinishedDate;
			return this;
		}

		public Builder c1(String c1) {
			this.c1 = c1;
			return this;
		}

		public Builder c1Date(String c1Date) {
			this.c1Date = c1Date;
			return this;
		}

		public Builder c1Finished(String c1Finished) {
			this.c1Finished = c1Finished;
			return this;
		}

		public Builder c1FinishedDate(String c1FinishedDate) {
			this.c1FinishedDate = c1FinishedDate;
			return this;
		}

		public Builder c(String c) {
			this.c = c;
			return this;
		}

		public Builder cDate(String cDate) {
			this.cDate = cDate;
			return this;
		}

		public Builder cFinished(String cFinished) {
			this.cFinished = cFinished;
			return this;
		}

		public Builder cFinishedDate(String cFinishedDate) {
			this.cFinishedDate = cFinishedDate;
			return this;
		}

		public Builder d1(String d1) {
			this.d1 = d1;
			return this;
		}

		public Builder d1Date(String d1Date) {
			this.d1Date = d1Date;
			return this;
		}

		public Builder d1Finished(String d1Finished) {
			this.d1Finished = d1Finished;
			return this;
		}

		public Builder d1FinishedFate(String d1FinishedFate) {
			this.d1FinishedFate = d1FinishedFate;
			return this;
		}

		public Builder d(String d) {
			this.d = d;
			return this;
		}

		public Builder dDate(String dDate) {
			this.dDate = dDate;
			return this;
		}

		public Builder dFinished(String dFinished) {
			this.dFinished = dFinished;
			return this;
		}

		public Builder dFinishedDate(String dFinishedDate) {
			this.dFinishedDate = dFinishedDate;
			return this;
		}

		public Builder be(String be) {
			this.be = be;
			return this;
		}

		public Builder beDate(String beDate) {
			this.beDate = beDate;
			return this;
		}

		public Builder beFinished(String beFinished) {
			this.beFinished = beFinished;
			return this;
		}

		public Builder beFinishedDate(String beFinishedDate) {
			this.beFinishedDate = beFinishedDate;
			return this;
		}

		public Builder c1e(String c1e) {
			this.c1e = c1e;
			return this;
		}

		public Builder c1eDate(String c1eDate) {
			this.c1eDate = c1eDate;
			return this;
		}

		public Builder c1eFinished(String c1eFinished) {
			this.c1eFinished = c1eFinished;
			return this;
		}

		public Builder c1eFinishedDate(String c1eFinishedDate) {
			this.c1eFinishedDate = c1eFinishedDate;
			return this;
		}

		public Builder ce(String ce) {
			this.ce = ce;
			return this;
		}

		public Builder ceDate(String ceDate) {
			this.ceDate = ceDate;
			return this;
		}

		public Builder ceFinished(String ceFinished) {
			this.ceFinished = ceFinished;
			return this;
		}

		public Builder ceFinishedDate(String ceFinishedDate) {
			this.ceFinishedDate = ceFinishedDate;
			return this;
		}

		public Builder d1e(String d1e) {
			this.d1e = d1e;
			return this;
		}

		public Builder d1eDate(String d1eDate) {
			this.d1eDate = d1eDate;
			return this;
		}

		public Builder d1eFinished(String d1eFinished) {
			this.d1eFinished = d1eFinished;
			return this;
		}

		public Builder d1eFinishedDate(String d1eFinishedDate) {
			this.d1eFinishedDate = d1eFinishedDate;
			return this;
		}

		public Builder de(String de) {
			this.de = de;
			return this;
		}

		public Builder deDate(String deDate) {
			this.deDate = deDate;
			return this;
		}

		public Builder deFinished(String deFinished) {
			this.deFinished = deFinished;
			return this;
		}

		public Builder deFinishedDate(String deFinishedDate) {
			this.deFinishedDate = deFinishedDate;
			return this;
		}

		public License build() {
			License driverLicenses = new License(this);
			return driverLicenses;
		}

	}

}
