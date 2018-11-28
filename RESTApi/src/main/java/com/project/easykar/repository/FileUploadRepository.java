/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.easykar.repository;

import com.project.easykar.controller.entity.UploadFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author manoj
 */
@Repository
public interface FileUploadRepository extends JpaRepository<UploadFiles, Long> {
    public UploadFiles findByUserID(Long Id);
}