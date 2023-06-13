package miu.cs425.mystudentmgmt.services;


import miu.cs425.mystudentmgmt.models.Transcript;

import java.util.List;
import java.util.Optional;

public interface TranscriptService {
    public Transcript insertTranscript(Transcript transcript);

    public List<Transcript> getAllTranscripts();

    public Optional<Transcript> getTranscriptById(Long transcriptId);

    public Transcript updateTranscript(Transcript transcript);

    public void deleteTranscript(Long transcriptId);

    public void deleteTranscript(Transcript transcript);
}
