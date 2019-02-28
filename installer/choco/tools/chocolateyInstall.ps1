Install-ChocolateyPackage -PackageName '@{package.name}' -FileType 'msi' -SilentArgs '/quiet' -Url64bit '@{link.release.index}/@{release}/@{release}_x64.msi' -ChecksumType64 'sha256' -Checksum64 '@{x64.msi.sha256}'
