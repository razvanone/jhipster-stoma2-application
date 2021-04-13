package com.razvanm.stoma2;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.razvanm.stoma2");

        noClasses()
            .that()
            .resideInAnyPackage("com.razvanm.stoma2.service..")
            .or()
            .resideInAnyPackage("com.razvanm.stoma2.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..com.razvanm.stoma2.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
