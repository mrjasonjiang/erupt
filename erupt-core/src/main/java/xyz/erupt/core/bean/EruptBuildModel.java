package xyz.erupt.core.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liyuepeng on 9/29/18.
 */
@Getter
@Setter
public class EruptBuildModel {

    private EruptModel eruptModel;

    private Map<String, EruptModel> tabErupts = new HashMap<>();

    private Map<String, EruptModel> referenceErupts = new HashMap<>();

    private Map<String, EruptModel> combineErupts = new HashMap<>();

    private Map<String, EruptModel> operationErupts = new HashMap<>();
}
