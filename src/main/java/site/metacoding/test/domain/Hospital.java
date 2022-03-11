package site.metacoding.test.domain;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Hospital {

    @Id
    private Integer id;

    private String addr;// 의료기관 주소
    private Integer mgtStaDd;// 운영시작일자
    private String pcrPsblYn;// 구분코드(PCR 가능여부)
    private String ratPsblYn;// RAT(신속항원검사) 가능여부
    private Integer recuClCd;// 요양종별코드
    private String sgguCdNm;// 시군구명
    private String sidoCdNm;// 시도명
    private String yadmNm; // 요양기관명
    private String ykihoEnc;// 암호화된 요양기호
    private String xposWgs84;// 세계지구 x좌표
    private String yposWgs84;// 세계지구 y좌표
    private String xpos; // null
    private String ypos; // null

}