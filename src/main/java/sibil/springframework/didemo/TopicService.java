package sibil.springframework.didemo;

import SpringController.Topics;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TopicService {
    List<Topics> topics;
    TopicService(){
        topics =new ArrayList<Topics>();
        Topics t1 =new Topics("1","C basics","C");
        Topics t2 =new Topics("2","C++ Basics","C++");
        Topics t3=new Topics("3","Spring Basics","Spring");
        topics.add(t1);
        topics.add(t2);
        topics.add(t3);

    }
    public List<Topics> getAlltopics() {
        return topics;
    }
    public Topics getParticularTopic(String id){
        //System.out.println(id);
        Topics t=new Topics();
        for(int i=0;i<topics.size();i++){
            t=topics.get(i);
            if(id.equals(t.getId()))
            return t;
            else
                t=new Topics();
        }
        return t;

    }

    public void addTopics(Topics topic) {
        topics.add(topic);
    }
}
