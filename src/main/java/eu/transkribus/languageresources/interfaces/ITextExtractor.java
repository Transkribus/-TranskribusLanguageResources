/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.transkribus.languageresources.interfaces;

/**
 *
 * @author max
 */
public interface ITextExtractor
{
    String extractTextFromDocument(String path);
    
    String extractTextFromDocument(String path, String splitCharacter);
}
