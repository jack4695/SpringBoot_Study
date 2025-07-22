package com.edu.springboot;

public class MemberDTO {

    // 아이디 및 비밀번호
    private String id;
    private String pass1;
    private String pass2;

    // 이름 및 성별
    private String name;
    private String sex; // "male" / "female"

    // 생년월일
    private String birth1; // 년 (ex: "2000")
    private String birth2; // 월 (ex: "01")
    private String birth3; // 일 (ex: "31")

    // 이메일
    private String email1;      // 이메일 앞부분
    private String email2;      // 이메일 도메인
    private String email_domain; // 셀렉트 박스 선택값 (직접입력 포함)
    private String mailing;     // yes / no

    // 주소
    private String zipcode;
    private String addr1; // 기본 주소
    private String addr2; // 상세 주소

    // 전화번호
    private String phone1;
    private String phone2;
    private String phone3;

    // 휴대전화
    private String mobile1;
    private String mobile2;
    private String mobile3;
    private String sms; // yes / no

    // 관심분야 & 가입경로
    private String etc_no1; // 관심분야 (select의 value)
    private String etc_no2; // 가입경로 (select의 value)
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass1() {
		return pass1;
	}
	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}
	public String getPass2() {
		return pass2;
	}
	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth1() {
		return birth1;
	}
	public void setBirth1(String birth1) {
		this.birth1 = birth1;
	}
	public String getBirth2() {
		return birth2;
	}
	public void setBirth2(String birth2) {
		this.birth2 = birth2;
	}
	public String getBirth3() {
		return birth3;
	}
	public void setBirth3(String birth3) {
		this.birth3 = birth3;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getEmail_domain() {
		return email_domain;
	}
	public void setEmail_domain(String email_domain) {
		this.email_domain = email_domain;
	}
	public String getMailing() {
		return mailing;
	}
	public void setMailing(String mailing) {
		this.mailing = mailing;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getPhone3() {
		return phone3;
	}
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}
	public String getMobile1() {
		return mobile1;
	}
	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}
	public String getMobile2() {
		return mobile2;
	}
	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}
	public String getMobile3() {
		return mobile3;
	}
	public void setMobile3(String mobile3) {
		this.mobile3 = mobile3;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	public String getEtc_no1() {
		return etc_no1;
	}
	public void setEtc_no1(String etc_no1) {
		this.etc_no1 = etc_no1;
	}
	public String getEtc_no2() {
		return etc_no2;
	}
	public void setEtc_no2(String etc_no2) {
		this.etc_no2 = etc_no2;
	}

    

    // 아래는 필요 시 생성할 수 있습니다:
    // - 이메일 완성 메서드 (getFullEmail)
    // - 전화번호 완성 메서드 (getFullPhone, getFullMobile)
}
