package com.dabico.gseapp.service;

import com.dabico.gseapp.dto.*;
import com.dabico.gseapp.model.GitRepo;
import com.dabico.gseapp.model.GitRepoLabel;
import com.dabico.gseapp.model.GitRepoLanguage;

import java.io.File;
import java.util.Date;
import java.util.List;

public interface GitRepoService {
    GitRepoDto getRepoById(Long id);
    List<GitRepoLabelDto> findRepoLabels(Long repoId);
    List<GitRepoLanguageDto> findRepoLanguages(Long repoId);
    GitRepoDtoList advancedSearch(String name, Boolean nameEquals, String language, String license, String label, Long commitsMin,
                                  Long commitsMax, Long contributorsMin, Long contributorsMax, Long issuesMin, Long issuesMax,
                                  Long pullsMin, Long pullsMax, Long branchesMin, Long branchesMax, Long releasesMin,
                                  Long releasesMax, Long starsMin, Long starsMax, Long watchersMin, Long watchersMax, Long forksMin,
                                  Long forksMax, Date createdMin, Date createdMax, Date committedMin, Date committedMax,
                                  Boolean excludeForks, Boolean onlyForks, Boolean hasIssues, Boolean hasPulls, Boolean hasWiki,
                                  Boolean hasLicense);
    GitRepoDtoListPaginated advancedSearch(String name, Boolean nameEquals, String language, String license, String label,
                                           Long commitsMin, Long commitsMax, Long contributorsMin, Long contributorsMax,
                                           Long issuesMin, Long issuesMax, Long pullsMin, Long pullsMax, Long branchesMin,
                                           Long branchesMax, Long releasesMin, Long releasesMax, Long starsMin,
                                           Long starsMax, Long watchersMin, Long watchersMax, Long forksMin,
                                           Long forksMax, Date createdMin, Date createdMax, Date committedMin,
                                           Date committedMax, Boolean excludeForks, Boolean onlyForks, Boolean hasIssues,
                                           Boolean hasPulls, Boolean hasWiki, Boolean hasLicense, Integer page,
                                           Integer pageSize);
    GitRepo createOrUpdateRepo(GitRepo repo);
    StringList getAllLabels();
    StringList getAllLanguages();
    StringList getAllLicenses();
    StringLongDtoList getAllLanguageStatistics();
    StringLongDtoList getMainLanguageStatistics();
    void createUpdateLabels(GitRepo repo, List<GitRepoLabel> labels);
    void createUpdateLanguages(GitRepo repo, List<GitRepoLanguage> languages);
}
