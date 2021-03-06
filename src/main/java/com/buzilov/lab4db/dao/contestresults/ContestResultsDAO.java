package com.buzilov.lab4db.dao.contestresults;

import com.buzilov.lab4db.model.ContestResults;

import java.util.List;

public interface ContestResultsDAO {
    ContestResults insertContestResults(ContestResults contest);
    ContestResults getContestResults(int id);
    ContestResults updateContestResults(ContestResults contest);
    ContestResults deleteContestResults(int id);
    List<ContestResults> getAll();
}
