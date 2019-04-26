package ru.butenko.task6.convertationContract;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContractToActConverter {

    public static Act contractConverter(Contract contract){
        return new Act(contract.getNumber(), contract.getDate(), contract.getList());
    }
}
