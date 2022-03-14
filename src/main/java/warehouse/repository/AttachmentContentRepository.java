package warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import warehouse.entity.Attachment;
import warehouse.entity.AttachmentContent;

import java.util.UUID;

@RepositoryRestResource(path = "attachmentcontent")
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, UUID> {
AttachmentContent findByAttachment(Attachment attachment);
}
