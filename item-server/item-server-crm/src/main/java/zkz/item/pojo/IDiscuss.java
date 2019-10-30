package zkz.item.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/*
* 项目讨论表
* @Data  代替Getter/Setter方法
* */
@Table(name = "i_discuss")
@Data
public class IDiscuss implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private Integer itemId;

    private String context;

    @Override
    public String toString() {
        return "IDiscuss{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", context='" + context + '\'' +
                '}';
    }
}