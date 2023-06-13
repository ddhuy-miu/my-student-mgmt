package miu.cs425.mystudentmgmt.services.impl;

import miu.cs425.mystudentmgmt.models.Transcript;
import miu.cs425.mystudentmgmt.repositories.TranscriptRepository;
import miu.cs425.mystudentmgmt.services.TranscriptService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TranscriptServiceImpl implements TranscriptService {
    //    @Autowired
    private TranscriptRepository transcriptRepository; // Field Injection

    public TranscriptServiceImpl(TranscriptRepository transcriptRepository) {
        this.transcriptRepository = transcriptRepository;
    }

    @Override
    public Transcript insertTranscript(Transcript transcript) {
        return transcriptRepository.save(transcript);
    }

    @Override
    public List<Transcript> getAllTranscripts() {
        return transcriptRepository.findAll();
    }

    @Override
    public Optional<Transcript> getTranscriptById(Long transcriptId) {
        return transcriptRepository.findById(transcriptId);
    }

    @Override
    public Transcript updateTranscript(Transcript transcript) {
        return transcriptRepository.save(transcript);
    }

    @Override
    public void deleteTranscript(Long transcriptId) {
        transcriptRepository.deleteById(transcriptId);
    }

    @Override
    public void deleteTranscript(Transcript transcript) {
        transcriptRepository.delete(transcript);
    }
}
